package com.ali.interview.entity;

import java.math.BigDecimal;

/**
 * 
 * 租房信息
 * @Author hao.wang
 * @Date 2020/9/9 10:41
 */
public class HouseInfo {
    private BigDecimal rent; //租金
    private Integer bedroomCount;//房数
    private Integer sittingRoomCount;//厅数

    public HouseInfo(BigDecimal rent, Integer bedroomCount, Integer sittingRoomCount) {
        this.rent = rent;
        this.bedroomCount = bedroomCount;
        this.sittingRoomCount = sittingRoomCount;
    }

    public BigDecimal getRent() {
        return rent;
    }

    public void setRent(BigDecimal rent) {
        this.rent = rent;
    }

    public Integer getBedroomCount() {
        return bedroomCount;
    }

    public void setBedroomCount(Integer bedroomCount) {
        this.bedroomCount = bedroomCount;
    }

    public Integer getSittingRoomCount() {
        return sittingRoomCount;
    }

    public void setSittingRoomCount(Integer sittingRoomCount) {
        this.sittingRoomCount = sittingRoomCount;
    }

    @Override
    public String toString() {
        return "房子{" +
                "价格：" + rent +
                ", 卧室数：" + bedroomCount +
                ", 客厅数：" + sittingRoomCount +
                '}';
    }
}
