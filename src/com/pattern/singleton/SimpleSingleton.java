package com.pattern.singleton;

/**
 * User: May
 * Date: 2015-06-16
 * Time: 14:06
 */
public class SimpleSingleton {
    private static SimpleSingleton singleton = null;
    private SimpleSingleton() {}

    //简单实现单例模式
    public SimpleSingleton getInstance() {
        if (singleton == null) {
            singleton = new SimpleSingleton();
        }
        return singleton;
    }

    //在同步中实现单例模式的 getInstance, 但是存在性能问题
    public synchronized SimpleSingleton getSingleton() {
        if (singleton == null) {
            singleton = new SimpleSingleton();
        }
        return singleton;
    }

}
