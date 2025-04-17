package com.zxylearn.observer.v1.entity.observer;

import com.zxylearn.observer.v1.DisplayElement;
import com.zxylearn.observer.v1.Observer;
import com.zxylearn.observer.v1.entity.subject.WeatherData;

/**
 * 二号展示板 - 观察者
 * @auther zhangxiaoyu
 * @date 2024/9/24 22:20
 * @description
 */
public class TwoDisplayObserver implements Observer, DisplayElement {

    private float humidity;

    private float pressure;

    private WeatherData weatherData;

    public TwoDisplayObserver(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("二号展示板-TwoDisplayObserver: humidity: " + humidity + " pressure: " + pressure);
    }

}
