/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.javamail.core;

import javax.mail.Address;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;

public abstract class AbstractEmailSender {
    
    private final EmailConfiguration emailConfiguration;

    public AbstractEmailSender(final EmailConfiguration emailConfiguration) {
        this.emailConfiguration = emailConfiguration;
    }

    public EmailConfiguration getEmailConfiguration() {
        return emailConfiguration;
    }

    // build address
    protected Address[] buildAddress(final String emails) throws MessagingException {
        final String[] splitedEmails = getEmails(emails);
        if (splitedEmails != null) {
            Address[] addresses = new Address[splitedEmails.length];
            for (int i = 0; i < splitedEmails.length; i++) {
                addresses[i] = new InternetAddress(splitedEmails[i]);
            }
            return addresses;
        }
        return null;
    }

    // split emails by comma, semi-comma or whitespaces
    protected String[] getEmails(String emails) {
        if (emails != null) {
            return emails.split("\\s*(,|;|\\s)\\s*");
        }
        return null;
    }

    
}
