package com.pattern.factory;

/**
 * Created by MayViolin on 2015/6/15.
 */
public class SenderFactory {
    //普通工厂模式
    public Sender produce(String type) {
        if (type.equals("mail")) {
            return new MailSender();
        } else if (type.equals("messaqge")) {
            return new MessageSender();
        } else {
            System.out.println("Type Error!");
            return null;
        }
    }

    //多个工厂方法模式
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceMessage() {
        return new MessageSender();
    }

    //静态工厂方法模式
    public static Sender produceMailSender() {
        return new MailSender();
    }

    public static Sender produceMessageSender() {
        return new MessageSender();
    }

    public static void main(String[] args) {
        SenderFactory sf = new SenderFactory();

        Sender test = sf.produce("mail");
        test.send();

        MailSender msTest = (MailSender)sf.produceMail();
        MessageSender mesTest = (MessageSender)sf.produceMessage();
        msTest.send();
        mesTest.send();

        Sender thridTest = SenderFactory.produceMailSender();
        thridTest.send();
    }
}
