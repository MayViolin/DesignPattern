package com.pattern.observer;

/**
 * User: May
 * Date: 2015-06-26
 * Time: 10:49
 */
public interface Subject {

    public void add(Observer observer);

    public void del(Observer observer);

    public void notifyObserver();

    public void operation();
}
