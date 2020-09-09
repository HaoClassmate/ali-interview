package com.ali.interview.observer;

/**
 *  抽象观察者
 *@author hao.wang
 *@date 2020/9/9 10:48
 */
public interface Observer {
    /**
     * 当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调。
     * @param info
     */
    void update(Object info);
}