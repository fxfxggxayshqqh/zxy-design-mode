package com.zxylearn.observer.v1.entity.observer;

import com.zxylearn.observer.v1.DisplayElement;
import com.zxylearn.observer.v1.Observer;
import com.zxylearn.observer.v1.Subject;

/**
 * 一号展示版 - 观察者
 * @auther zhangxiaoyu
 * @date 2024/9/24 22:20
 * @description
 */
public class OneDisplayObserver implements Observer, DisplayElement {

    private float temperature;

    private float humidity;

    private Subject weatherData;

    public OneDisplayObserver(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("一号展示板-OneDisplayObserver: temperature: " + temperature + " humidity: " + humidity);
    }

}
