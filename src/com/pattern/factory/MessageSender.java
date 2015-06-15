package com.pattern.factory;

/**
 * Created by MayViolin on 2015/6/15.
 */
public class MessageSender implements Sender {
    public void send() {
        System.out.println("Send a message via MessageSender~!");
    }
}
