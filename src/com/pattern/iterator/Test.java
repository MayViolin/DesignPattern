package com.pattern.iterator;

/**
 * User: May
 * Date: 2015-06-26
 * Time: 11:57
 */
public class Test {
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = new MyIterator(collection);

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(it.first());
    }
}
