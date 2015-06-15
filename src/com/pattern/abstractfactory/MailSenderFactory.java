package com.pattern.abstractfactory;

/**
 * Created by MayViolin on 2015/6/15.
 */
public class MailSenderFactory implements Provider{
    public Sender produce() {
        return new MailSender();
    }
}
