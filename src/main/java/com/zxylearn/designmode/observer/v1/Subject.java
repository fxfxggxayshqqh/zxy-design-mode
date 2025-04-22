package com.zxylearn.designmode.observer.v1;

/**
 * @auther zhangxiaoyu
 * @date 2024/9/24 22:09
 * @description 主题接口
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
