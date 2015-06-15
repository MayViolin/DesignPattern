package com.pattern.abstractfactory;


import javax.sound.sampled.Port;

/**
 * Created by MayViolin on 2015/6/15.
 */
public class MessageSenderFactory implements Provider{
    public MessageSender produce() {
        return new MessageSender();
    }
}
