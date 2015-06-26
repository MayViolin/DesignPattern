package com.pattern.memento;

/**
 * User: May
 * Date: 2015-06-26
 * Time: 16:10
 */
public class Memento {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Memento(String value) {
        this.value = value;
    }
}
