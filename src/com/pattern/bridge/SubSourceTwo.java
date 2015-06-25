package com.pattern.bridge;

/**
 * User: May
 * Date: 2015-06-25
 * Time: 11:53
 */
public class SubSourceTwo implements Sourceable {
    @Override
    public void method() {
        System.out.println("this is second sub class !");
    }
}
