package com.pattern.singleton;

/**
 * User: May
 * Date: 2015-06-16
 * Time: 14:20
 * 利用内部类维护单例
 */
public class SingletonUseIC {
    private SingletonUseIC() {}

    //一旦在构造函数中抛出异常，则以下代码将永远不会执行
    private static class Singleton {
        private static SingletonUseIC singleton = new SingletonUseIC();
    }

    public SingletonUseIC getInstance() {
        return Singleton.singleton;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }
}
