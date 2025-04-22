package com.zxylearn.designmode.observer.v1;

import com.zxylearn.designmode.observer.v1.entity.observer.OneDisplayObserver;
import com.zxylearn.designmode.observer.v1.entity.observer.TwoDisplayObserver;
import com.zxylearn.designmode.observer.v1.entity.subject.WeatherData;

/**
 * @auther zhangxiaoyu
 * @date 2024/10/7 21:34
 * @description
 */
public class TestMain {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        // OneDisplayObserver oneDisplayObserver = 
        new OneDisplayObserver(weatherData);
        // TwoDisplayObserver twoDisplayObserver = 
        new TwoDisplayObserver(weatherData);

        weatherData.setMeasurements(10, 20, 30);
    }
}
