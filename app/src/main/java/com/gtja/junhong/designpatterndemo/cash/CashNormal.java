package com.gtja.junhong.designpatterndemo.cash;

/**
 * Created by Jack Feng on 2018/1/13.
 */

public class CashNormal extends CashSuper {

    @Override
    public double cashAccept(double money) {
        return money;
    }
}
