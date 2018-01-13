package com.gtja.junhong.designpatterndemo.cash;

/**
 * Created by Jack Feng on 2018/1/13.
 */

public class CashRebate extends CashSuper {

    private double discount;

    public CashRebate(double discount) {
        this.discount = discount;
    }

    @Override
    public double cashAccept(double money) {
        return money * discount;
    }
}
