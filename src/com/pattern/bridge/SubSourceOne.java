package com.pattern.bridge;

/**
 * User: May
 * Date: 2015-06-25
 * Time: 11:52
 */
public class SubSourceOne implements Sourceable {
    @Override
    public void method() {
        System.out.println("This is first sub class !");
    }
}
