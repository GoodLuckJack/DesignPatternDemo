package com.gtja.junhong.designpatterndemo.decorator;

/**
 * Created by Jacky on 2019/1/5.
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 4.58 + getSize();
    }
}
