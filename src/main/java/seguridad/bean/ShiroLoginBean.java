/**
 * Very simple bean that authenticates the user via Apache Shiro, using JSF
 * @author Daniel Mascarenhas
 */
package seguridad.bean;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import org.apache.shiro.authc.credential.DefaultPasswordService;
import org.apache.shiro.crypto.hash.DefaultHashService;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.util.SimpleByteSource;


@ManagedBean(name = "loginBean")
@ViewScoped
public class ShiroLoginBean implements Serializable {
    private static final Logger log = LoggerFactory.getLogger(ShiroLoginBean.class);

    private String username;
    private String password;
    private Boolean rememberMe;

    public ShiroLoginBean() {
        
    }

    public Subject getSubject() {
        return SecurityUtils.getSubject();
    }
    
    /**
     * Try and authenticate the user
     */
    public void doLogin() {
        Subject subject = SecurityUtils.getSubject();
        
        UsernamePasswordToken token = new UsernamePasswordToken(getUsername(), getPassword(), getRememberMe());

        try {
            subject.login(token);

            if (subject.hasRole("directivo")) {
                FacesContext.getCurrentInstance().getExternalContext().redirect("directivo/ajustarparametros.xhtml");
            }
            else if(subject.hasRole("estudiante")){
                FacesContext.getCurrentInstance().getExternalContext().redirect("estudiante/serviciocancelaciones.xhtml");
            }
            else {
                FacesContext.getCurrentInstance().getExternalContext().redirect("open/index.xhtml");
            }
        }
        catch (UnknownAccountException ex) {
            facesError("Unknown account");
            log.error(ex.getMessage(), ex);
            ex.printStackTrace();
        }
        catch (IncorrectCredentialsException ex) {
            facesError("Wrong password");
            log.error(ex.getMessage(), ex);
            ex.printStackTrace();
        }
        catch (LockedAccountException ex) {
            facesError("Locked account");
            log.error(ex.getMessage(), ex);
            ex.printStackTrace();
        }
        catch (AuthenticationException ex) {
            facesError("Unknown error: " + ex.getMessage());
            log.error(ex.getMessage(), ex);
            ex.printStackTrace();
        }
        catch (IOException ex){
            facesError("Unknown error: " + ex.getMessage());
            log.error(ex.getMessage(), ex);
            ex.printStackTrace();
        }
        finally {
            token.clear();
        }
    }

    /**
     * Adds a new SEVERITY_ERROR FacesMessage for the ui
     * @param message Error Message
     */
    private void facesError(String message) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, message, null));
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String login) {
        this.username = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String senha) {
        this.password = senha;
    }

    public Boolean getRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(Boolean lembrar) {
        this.rememberMe = lembrar;
    }
    
    public static String generateHash(String password){
        DefaultHashService hashService = new DefaultHashService();
        hashService.setHashIterations(500000); // 500000
        hashService.setHashAlgorithmName(Sha256Hash.ALGORITHM_NAME);
        
        // Same salt as in shiro.ini, but NOT base64-encoded!!
        hashService.setPrivateSalt(new SimpleByteSource("myprivatesalt")); 
        hashService.setGeneratePublicSalt(true);

        DefaultPasswordService passwordService = new DefaultPasswordService();
        passwordService.setHashService(hashService);
        String encryptedPassword = passwordService.encryptPassword(password);
        
        return encryptedPassword;
        
    }
        
}
