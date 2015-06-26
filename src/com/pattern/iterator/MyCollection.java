package com.pattern.iterator;



/**
 * User: May
 * Date: 2015-06-26
 * Time: 11:37
 */
public class MyCollection implements Collection {
    String[] str = {"A", "B", "C", "D", "E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        if (i < 0 || i > size()) throw new IndexOutOfBoundsException();
        return str[i];
    }

    @Override
    public int size() {
        return str.length;
    }
}
