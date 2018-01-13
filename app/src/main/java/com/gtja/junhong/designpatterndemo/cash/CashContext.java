package com.gtja.junhong.designpatterndemo.cash;

/**
 * Created by Jack Feng on 2018/1/13.
 */

public class CashContext {

    private CashSuper cashSuper;

    public void setBehavior(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double acceptCash(double money) {
        return cashSuper.cashAccept(money);
    }
}
