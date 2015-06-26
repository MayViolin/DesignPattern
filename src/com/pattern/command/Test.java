package com.pattern.command;

/**
 * User: May
 * Date: 2015-06-26
 * Time: 15:58
 */
public class Test {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
