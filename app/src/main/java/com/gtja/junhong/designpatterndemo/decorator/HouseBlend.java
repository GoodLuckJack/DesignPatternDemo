package com.gtja.junhong.designpatterndemo.decorator;

/**
 * Created by Jacky on 2019/1/5.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 2.35 + getSize();
    }
}
