package com.pattern.bridge;

/**
 * User: May
 * Date: 2015-06-25
 * Time: 11:55
 */
public class MyBridge extends Bridge {

    public void method() {
        getSource().method();
    }


    public static void main(String[] args) {
        Bridge bridge = new MyBridge();

        Sourceable subOne = new SubSourceOne();
        bridge.setSource(subOne);
        bridge.method();

        Sourceable subTwo = new SubSourceTwo();
        bridge.setSource(subTwo);
        bridge.method();
    }
}
