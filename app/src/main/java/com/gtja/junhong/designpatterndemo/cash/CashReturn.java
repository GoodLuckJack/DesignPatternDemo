package com.gtja.junhong.designpatterndemo.cash;

/**
 * Created by Jack Feng on 2018/1/13.
 */

public class CashReturn extends CashSuper {

    private double startAmount;
    private double returnAmount;

    public CashReturn(double startAmount, double returnAmount) {
        this.startAmount = startAmount;
        this.returnAmount = returnAmount;
    }

    @Override
    public double cashAccept(double money) {
        int times = (int) (money / startAmount);
        return money - times * returnAmount;
    }
}
