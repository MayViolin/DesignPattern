package com.pattern.observer;

/**
 * User: May
 * Date: 2015-06-26
 * Time: 10:48
 */
public class ObserverTwo implements Observer {
    @Override
    public void update() {
        System.out.println("Observer two is updated !");
    }
}
