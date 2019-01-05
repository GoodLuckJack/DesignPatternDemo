package com.gtja.junhong.designpatterndemo.decorator;

/**
 * Created by Jacky on 2019/1/5.
 */
public class PatternHelper {

    public double getCost() {
        Beverage drink = new Espresso();
        drink.setSize(Constant.CUP_SIZE.big.getValue());
        drink = new Mocha(drink);
        drink = new Soy(drink);
        drink = new Whip(drink);
        return drink.cost();
    }

}
