package com.zxylearn.designmode.observer.v2.entity.observer;

import java.util.Observable;
import java.util.Observer;

import com.zxylearn.designmode.observer.v2.DisplayElement;
import com.zxylearn.designmode.observer.v2.entity.subject.WeatherData;

/**
 * @auther zhangxiaoyu
 * @date 2024/10/7 22:41
 * @description
 */
public class TwoDisplayObserver implements Observer, DisplayElement {

    private float currentPressure = 29.92f;

    private float lastPressure;

    public TwoDisplayObserver(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("二号展示板-TwoDisplayobserver: currentPressure: " + currentPressure + " lastPressure: " + lastPressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
