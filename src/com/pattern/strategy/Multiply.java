package com.pattern.strategy;

/**
 * User: May
 * Date: 2015-06-25
 * Time: 16:50
 */
public class Multiply extends AbstrateCaculator implements ICaculator {
    @Override
    public int caculate(String exp) {
        int array[] = split(exp, "\\*");
        return array[0] * array[1];
    }
}
