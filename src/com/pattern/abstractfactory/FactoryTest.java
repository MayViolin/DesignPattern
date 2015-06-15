package com.pattern.abstractfactory;

/**
 * Created by MayViolin on 2015/6/15.
 */
public class FactoryTest {
    public static void main(String[] args) {
        Provider provider = new MailSenderFactory();
        Sender mailSender = provider.produce();
        mailSender.send();
    }
}
