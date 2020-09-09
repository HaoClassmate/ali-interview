package com.ali.interview.renting;

import java.util.ArrayList;
import java.util.List;

import com.ali.interview.entity.HouseInfo;
import com.ali.interview.observer.Observer;
import com.ali.interview.observer.Observerable;

/**
 * 中介，被观察者
 *@author hao.wang
 *@date 2020/9/9 10:51
 */
public class IntermediaryAgent implements Observerable {
    
    //观察者集合
    private List<Observer> observers = new ArrayList<>();
    //租房信息
    private HouseInfo houseInfo;
    
    public IntermediaryAgent() {
    }
    
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    
    @Override
    public void removeObserver(Observer o) {
        if(!observers.isEmpty()){
            observers.remove(o); 
        }
    }

    @Override
    public void notifyObserver() {
        if (null == houseInfo) {
            return;
        }
        for (Observer observer : observers) {
            observer.update(houseInfo);
        } 
    }

    /**
     * 设置通知消息
     * @param houseInfo 租房信息
     */
    public void setInfomation(HouseInfo houseInfo) {
        this.houseInfo = houseInfo;
        //通知更新，通知所有观察者
        notifyObserver();
    }

}