package com.gtja.junhong.designpatterndemo.decorator;

/**
 * Created by Jacky on 2019/1/5.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.11 + getSize();
    }
}
