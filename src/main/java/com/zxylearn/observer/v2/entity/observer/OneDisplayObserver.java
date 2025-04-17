package com.zxylearn.observer.v2.entity.observer;

import com.zxylearn.observer.v2.DisplayElement;
import com.zxylearn.observer.v2.entity.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * @auther zhangxiaoyu
 * @date 2024/10/7 22:33
 * @description
 */
public class OneDisplayObserver implements Observer, DisplayElement {

    private float temperature;

    private float humidity;

    public OneDisplayObserver(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("一号展示板-OneDisplayobserver: temperature: " + temperature + " humidity: " + humidity);
    }

    @Override
    public void update(Observable o, Object arg) {

        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }

    }
}
