package com.pattern.adapter.interfaceadapter;

/**
 * User: May
 * Date: 2015-06-16
 * Time: 16:00
 */
public class TargetOne extends Source {
    public void methodOne() {
        System.out.println("This is method one in TargetOne !");
    }

    public static void main(String[] args) {
        Sourceable targetOne = new TargetOne();
        Sourceable targetTwo = new TargetTwo();
        targetOne.methodOne();
        targetOne.methodTwo();
        targetTwo.methodOne();
        targetTwo.methodTwo();
    }
}

class TargetTwo extends Source {
    public void methodTwo() {
        System.out.println("This is method two in TargetTwo !");
    }
}
