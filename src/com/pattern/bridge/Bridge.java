package com.pattern.bridge;

/**
 * User: May
 * Date: 2015-06-25
 * Time: 11:53
 */
public abstract class Bridge {
    Sourceable source;

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }

    public void method() {
        source.method();
    }


}
