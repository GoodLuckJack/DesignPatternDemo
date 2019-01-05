package com.gtja.junhong.designpatterndemo.decorator;

/**
 * Created by Jacky on 2019/1/5.
 */
public abstract class Beverage {

    private double size;

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }
}
