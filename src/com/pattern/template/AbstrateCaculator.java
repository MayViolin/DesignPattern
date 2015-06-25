package com.pattern.template;

/**
 * User: May
 * Date: 2015-06-25
 * Time: 16:45
 */
public abstract class AbstrateCaculator {

    public final int caculate(String exp, String opt) {
        int array[] = split(exp, opt);
        return caculate(array[0], array[1]);
    }

    abstract public int caculate(int a, int b);

    public int[] split(String exp, String opt) {
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
