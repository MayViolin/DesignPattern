package com.pattern.iterator;

/**
 * User: May
 * Date: 2015-06-26
 * Time: 11:45
 */
public interface Iterator {

    public Object previous();

    public Object next();

    public boolean hasNext();

    public Object first();
}
