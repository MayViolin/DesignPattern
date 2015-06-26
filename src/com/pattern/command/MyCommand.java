package com.pattern.command;

/**
 * User: May
 * Date: 2015-06-26
 * Time: 15:23
 */
public class MyCommand implements Command{
    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exec() {
        receiver.action();
    }
}
