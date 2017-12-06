/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.javamail.core;

import javax.mail.*;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public class SimpleEmailSender extends AbstractEmailSender implements EmailSender {

    public SimpleEmailSender(EmailConfiguration emailConfiguration) {
        super(emailConfiguration);
    }

    @Override
    public void send(Email email) throws MessagingException {
        // gets email properties
        final Properties properties = getEmailConfiguration().getProperties();

        // creates a mail session
        final Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(properties.getProperty("mail.user"), properties.getProperty("mail.password"));
            }
        });

        // creates MIME style email message
        final Message message = new MimeMessage(session);

        message.setSentDate(new Date());
        message.setSubject(email.getSubject());
        message.setText(email.getMessage());

        // extract and creates address (to)
        final Address[] toAddresses = buildAddress(email.getTo());
        if (toAddresses == null || toAddresses.length == 0) {
            throw new MessagingException("Please provide at least one valid (To) primary recipient address");
        }
        message.addRecipients(Message.RecipientType.TO, toAddresses);

        // extract and creates address (cc)
        final Address[] ccAddresses = buildAddress(email.getCc());
        if (ccAddresses != null && ccAddresses.length > 0) {
            message.addRecipients(Message.RecipientType.CC, ccAddresses);
        }

        // extract and creates address (bcc)
        final Address[] bccAddresses = buildAddress(email.getBcc());
        if (bccAddresses != null && bccAddresses.length > 0) {
            message.addRecipients(Message.RecipientType.BCC, bccAddresses);
        }

        // extract and creates address (from)
        final Address[] fromAddresses = buildAddress(email.getFrom());
        if (fromAddresses == null || fromAddresses.length == 0) {
            message.setFrom();
        } else {
            message.addFrom(fromAddresses);
        }

        // sends the message
        Transport.send(message);
    }

}
