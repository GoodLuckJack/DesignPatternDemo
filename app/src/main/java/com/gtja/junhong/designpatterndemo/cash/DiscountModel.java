package com.gtja.junhong.designpatterndemo.cash;

/**
 * Created by Jack Feng on 2018/1/13.
 */

public class DiscountModel {
    private String discountName;
    private String className;
    private String param;

    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}
