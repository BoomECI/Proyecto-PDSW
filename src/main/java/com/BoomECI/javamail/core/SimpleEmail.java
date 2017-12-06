package com.BoomECI.javamail.core;

public class SimpleEmail implements Email {

    private final String from, to, cc, bcc, subject, message;

    public SimpleEmail(String to, String subject, String message) {
        this(null, to, null, null, subject, message);
    }

    public SimpleEmail(String from, String to, String subject, String message) {
        this(from, to, null, null, subject, message);
    }

    public SimpleEmail(String from, String to, String cc, String bcc, String subject, String message) {
        this.from = from;
        this.to = to;
        this.cc = cc;
        this.bcc = bcc;
        this.subject = subject;
        this.message = message;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public String getCc() {
        return cc;
    }

    @Override
    public String getBcc() {
        return bcc;
    }

    @Override
    public String getSubject() {
        return subject;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
