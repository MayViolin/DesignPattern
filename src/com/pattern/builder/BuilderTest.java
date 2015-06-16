package com.pattern.builder;

import java.util.ArrayList;

/**
 * User: May
 * Date: 2015-06-16
 * Time: 14:39
 */
public class BuilderTest {

    private ArrayList<Sender> senders = new ArrayList<Sender>();

    public ArrayList<Sender> getMailSenders() {
        for (int i = 0; i < 10; ++i) {
            senders.add(new MailSender());
        }
        return senders;
    }

    public ArrayList<Sender> getMessageSenders() {
        for (int i = 0 ; i < 10; ++i) {
            senders.add(new MessageSender());
        }
        return senders;
    }

    public static void main(String[] args) {
        BuilderTest test = new BuilderTest();
        ArrayList<Sender> res = test.getMessageSenders();
        for (Sender s : res) {
            s.send();
        }
    }
}
