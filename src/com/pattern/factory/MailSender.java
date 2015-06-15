package com.pattern.factory;

/**
 * Created by MayViolin on 2015/6/15.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("Send a mail via MailSender~!");
    }
}
