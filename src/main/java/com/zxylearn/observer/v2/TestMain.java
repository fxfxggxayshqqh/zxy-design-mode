package com.zxylearn.observer.v2;

import com.zxylearn.observer.v2.entity.observer.OneDisplayObserver;
import com.zxylearn.observer.v2.entity.observer.TwoDisplayObserver;
import com.zxylearn.observer.v2.entity.subject.WeatherData;

/**
 * @auther zhangxiaoyu
 * @date 2024/10/7 22:46
 * @description
 */
public class TestMain {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        OneDisplayObserver oneDisplayObserver = new OneDisplayObserver(weatherData);
        TwoDisplayObserver twoDisplayObserver = new TwoDisplayObserver(weatherData);

//        weatherData.deleteObserver(oneDisplayObserver);

        weatherData.setMeasurements(10, 20, 30);
    }
}
