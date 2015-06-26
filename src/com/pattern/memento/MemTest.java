package com.pattern.memento;

/**
 * User: May
 * Date: 2015-06-26
 * Time: 16:26
 */
public class MemTest{

    public static void main(String[] args) {
        Origin origin = new Origin("test");
        Memento mem = new Memento(origin.getValue());

        Storage storage = new Storage(mem);

        System.out.println("初始化状态为：" + origin.getValue());
        origin.setValue("new");
        System.out.println("修改后的状态为：" + origin.getValue());

        origin.restoreMemento(mem);
        System.out.println("恢复后的状态为：" + origin.getValue());
    }


}
