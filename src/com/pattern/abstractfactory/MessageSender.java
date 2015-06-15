package com.pattern.abstractfactory;

/**
 * Created by MayViolin on 2015/6/15.
 */
public class MessageSender implements Sender{

    @Override
    public void send() {
        System.out.println("Send a Message via Message Sender~!");
    }
}
