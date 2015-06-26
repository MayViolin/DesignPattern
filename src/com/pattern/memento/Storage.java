package com.pattern.memento;

/**
 * User: May
 * Date: 2015-06-26
 * Time: 16:26
 */
public class Storage {

    Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
