package com.pattern.observer;

import java.util.Vector;

/**
 * User: May
 * Date: 2015-06-26
 * Time: 10:54
 */
public abstract class AbstractSubject implements Subject{
    private Vector<Observer> observers;

    public AbstractSubject() {
        observers = new Vector<Observer>();
    }

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void del(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
