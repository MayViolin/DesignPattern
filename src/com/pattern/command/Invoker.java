package com.pattern.command;

/**
 * User: May
 * Date: 2015-06-26
 * Time: 15:24
 */
public class Invoker {

    Command command;

    public Invoker(Command cmd) {
        command = cmd;
    }

    public void action() {
        command.exec();
    }

}
