package com.pattern.strategy;

/**
 * User: May
 * Date: 2015-06-25
 * Time: 16:51
 */
public class StrategyTest {
    public static void main(String[] args) {
        String exp = "2+8";
        ICaculator caculator = new Plus();
        System.out.println(caculator.caculate(exp));
    }
}
