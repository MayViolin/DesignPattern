package com.pattern.observer;

/**
 * User: May
 * Date: 2015-06-26
 * Time: 10:47
 */
public class ObserverOne implements Observer {
    @Override
    public void update() {
        System.out.println("Observer one is updated !");
    }
}
