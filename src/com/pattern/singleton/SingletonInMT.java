package com.pattern.singleton;

import java.util.Vector;

/**
 * User: May
 * Date: 2015-06-16
 * Time: 14:10
 */
public class SingletonInMT {
    private static SingletonInMT singleton = null;
    private SingletonInMT() {}

    //这样可能因为指令重排导致程序运行错误
    public SingletonInMT getInstance() {
            if (singleton == null) {
                synchronized (singleton) {//可能会导致NullPointerException！！！！！！！！！
                    singleton = new SingletonInMT();
                }
            }
        return singleton;
    }

    //将创建单例对象与分配空间放在一起，则避免了指令重排的问题
    private synchronized void singletonInit() {
        if (singleton == null) {
            singleton = new SingletonInMT();
        }
    }

    public SingletonInMT getSingleton() {
        if (singleton == null) {
            singletonInit();
        }
        return singleton;
    }

    //采用"影子实例"的办法为单例对象的属性同步更新
    private Vector properties = null;
    public Vector getProperties() {
        return properties;
    }
    public void updateProperties() {
        SingletonInMT shadow = new SingletonInMT();
        properties = shadow.getProperties();
    }
}
