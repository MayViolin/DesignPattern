package com.pattern.iterator;

/**
 * User: May
 * Date: 2015-06-26
 * Time: 11:37
 */
public interface Collection {
    public Iterator iterator();
    public Object get(int i);
    public int size();
}
