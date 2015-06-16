package com.pattern.builder;

/**
 * User: May
 * Date: 2015-06-16
 * Time: 14:40
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("Send from mail sender ~ !");
    }
}


class  MessageSender implements Sender {

    @Override
    public void send() {
        System.out.println("Send from Message Sender ~ !");
    }
}