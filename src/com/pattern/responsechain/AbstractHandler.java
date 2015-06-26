package com.pattern.responsechain;

/**
 * User: May
 * Date: 2015-06-26
 * Time: 15:10
 */
public abstract class AbstractHandler  {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
