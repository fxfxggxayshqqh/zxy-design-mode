package com.zxylearn.designmode.observer.v1;

/**
 * @auther zhangxiaoyu
 * @date 2024/9/24 22:10
 * @description 观察者接口
 */
public interface Observer {

    void update(float temperature, float humidity, float pressure);

}
