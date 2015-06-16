package com.pattern.adapter.objectadapter;

/**
 * User: May
 * Date: 2015-06-16
 * Time: 15:53
 */
public class Wrapper implements Target {
    private Source source;

    public Wrapper(Source s) {
        this.source = s;
    }

    @Override
    public void methodOne() {
        source.methodOne();
    }

    @Override
    public void methodTwo() {
        System.out.println("This is method in Wrapper!");
    }

    public static void main(String[] args) {
        Target test = new Wrapper(new Source());
        test.methodOne();
        test.methodTwo();
    }
}
