package com.pattern.template;

/**
 * User: May
 * Date: 2015-06-25
 * Time: 16:51
 */
public class StrategyTest {
    public static void main(String[] args) {
        String exp = "8+8";
        AbstrateCaculator cal = new Plus();
        System.out.println(cal.caculate(exp, "\\+"));
    }
}
