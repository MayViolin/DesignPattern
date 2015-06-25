package com.pattern.proxy;

/**
 * User: May
 * Date: 2015-06-25
 * Time: 10:54
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("This is method in origin !");
    }
}
