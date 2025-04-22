package com.zxylearn.designmode.observer.v1.entity.subject;

import java.util.ArrayList;

import com.zxylearn.designmode.observer.v1.Observer;
import com.zxylearn.designmode.observer.v1.Subject;

/**
 * @auther zhangxiaoyu
 * @date 2024/9/24 22:19
 * @description
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers = new ArrayList<Observer>();

    private float temperature;

    private float humidity;

    private float pressure;

    /**
     * 注册观察者
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    /**
     * 通知观察者
     */
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 测量数据改变时，会调用的方法
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 测试方法 - 模拟数据改变
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
