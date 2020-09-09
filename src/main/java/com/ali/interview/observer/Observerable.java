package com.ali.interview.observer;

/**
 * 抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 *@author hao.wang
 *@date 2020/9/9 10:49
 */
public interface Observerable {
     void registerObserver(Observer o);
     void removeObserver(Observer o);
     void notifyObserver();
    
}