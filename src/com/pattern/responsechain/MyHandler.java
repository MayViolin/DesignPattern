package com.pattern.responsechain;

/**
 * User: May
 * Date: 2015-06-26
 * Time: 15:12
 */
public class MyHandler extends AbstractHandler implements Handler {
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println(name + " is handling !");
        if (getHandler() != null)
            getHandler().operation();
    }

    public static void main(String[] args) {
        MyHandler h1 = new MyHandler("h1");
        MyHandler h2 = new MyHandler("h2");
        MyHandler h3 = new MyHandler("h3");

        h1.setHandler(h2);
        h2.setHandler(h3);

        h1.operation();
    }
}
