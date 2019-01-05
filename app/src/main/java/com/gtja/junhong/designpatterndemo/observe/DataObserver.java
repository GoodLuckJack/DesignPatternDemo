package com.gtja.junhong.designpatterndemo.observe;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Jacky on 2019/1/5.
 */
public class DataObserver implements Observer {

    private Observable dataObservable;

    private float temperature;
    private float pressure;

    public DataObserver(Observable dataObservable) {
        this.dataObservable = dataObservable;
        dataObservable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof DataObservable) {
            DataObservable dataObservable = (DataObservable) o;
            this.temperature = dataObservable.getTemperature();
            this.pressure = dataObservable.getPressure();
        }
    }
}
