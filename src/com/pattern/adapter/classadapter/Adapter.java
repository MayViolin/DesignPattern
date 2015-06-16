package com.pattern.adapter.classadapter;

/**
 * User: May
 * Date: 2015-06-16
 * Time: 15:40
 */
public class Adapter extends Source implements Target {
    @Override
    public void methodtwo() {
        System.out.println("This is target method ~");
    }

    public static void main(String[] args) {
        Target test = new Adapter();
        test.methodtwo();
        test.methodOne();
    }
}
