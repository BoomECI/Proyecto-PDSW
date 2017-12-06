/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.javamail.core;

import javax.mail.MessagingException;

public interface EmailSender {

    void send(Email email) throws MessagingException;

}