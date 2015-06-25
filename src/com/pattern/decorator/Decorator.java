package com.pattern.decorator;

/**
 * User: May
 * Date: 2015-06-25
 * Time: 10:54
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source) {
        super();
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("Before source's method ...");
        source.method();
        System.out.println("After source's method ...");
    }

    public static void main(String[] args) {
        Sourceable source = new Source();
        Decorator test = new Decorator(source);
        test.method();
    }
}
