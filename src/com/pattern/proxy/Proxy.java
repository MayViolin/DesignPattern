package com.pattern.proxy;

/**
 * User: May
 * Date: 2015-06-25
 * Time: 11:25
 */
public class Proxy implements Sourceable {

    private Sourceable source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        System.out.println("Before source's method ...");
        source.method();
        System.out.println("After source's method ...");
    }

    public static void main(String[] args) {
        Sourceable test = new Proxy();
        test.method();
    }
}
