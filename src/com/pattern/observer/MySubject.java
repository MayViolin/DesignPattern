package com.pattern.observer;

/**
 * User: May
 * Date: 2015-06-26
 * Time: 10:52
 */
public class MySubject extends AbstractSubject {

    public void operation() {
        System.out.println("update self !");
        notifyObserver();
    }

    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new ObserverOne());
        sub.add(new ObserverTwo());
        sub.operation();
    }
}
