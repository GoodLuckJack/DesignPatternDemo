package com.gtja.junhong.designpatterndemo.decorator;

/**
 * Created by Jacky on 2019/1/5.
 */
public interface Constant {

    enum CUP_SIZE {
        big(0.2),
        middle(0.15),
        small(0.1);

        private double value;

        CUP_SIZE(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }
    }
}
