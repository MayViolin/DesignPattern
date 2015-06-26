package com.pattern.memento;

/**
 * User: May
 * Date: 2015-06-26
 * Time: 16:09
 */
public class Origin {

    private String value;

    public Origin(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    Memento createMemento() {
        return new Memento(value);
    }

    public void restoreMemento(Memento memento) {
        this.value = memento.getValue();
    }
}
