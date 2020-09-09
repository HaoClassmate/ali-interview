package com.ali.interview.renting;

import java.math.BigDecimal;
import java.util.Optional;

import com.ali.interview.entity.HouseInfo;
import com.ali.interview.observer.Observer;

/**
 * 租房者
 * @Author hao.wang
 * @Date 2020/9/9 11:00
 */
public class Tenant implements Observer {
    //租户姓名
    private String name;
    //租户手机
    private String phone;
    //租户预想最低租金
    private Optional<BigDecimal> idealMinRent;
    //租户预想最高租金
    private Optional<BigDecimal> idealMaxRent;
    //租户预想卧室数量
    private Optional<Integer> idealBedroomCount;
    //租户预想客厅数量
    private Optional<Integer> idealSittingRoomCount;

    public Tenant(String name, String phone, Optional<BigDecimal> idealMinRent,Optional<BigDecimal> idealMaxRent, Optional<Integer> idealBedroomCount, Optional<Integer> idealSittingRoomCount) {
        this.name = name;
        this.idealMinRent = idealMinRent;
        this.idealMaxRent = idealMaxRent;
        this.phone = phone;
        this.idealBedroomCount = idealBedroomCount;
        this.idealSittingRoomCount = idealSittingRoomCount;
    }

    @Override
    public void update(Object info) {
        if (info instanceof HouseInfo) {
            HouseInfo houseInfo = (HouseInfo) info;
            //最小租金是否满足
            boolean minRentMatch = !idealMinRent.isPresent() || houseInfo.getRent().compareTo(idealMinRent.get()) >= 0;
            //最大租金是否满足
            boolean MaxRentMatch = !idealMaxRent.isPresent() || houseInfo.getRent().compareTo(idealMaxRent.get()) <= 0;
            //卧室数量是否满足
            boolean bedroomMatch = !idealBedroomCount.isPresent() || houseInfo.getBedroomCount().equals(idealBedroomCount.get());
            //客厅数量是否满足
            boolean sittingRoomMatch = !idealSittingRoomCount.isPresent() || houseInfo.getSittingRoomCount().equals(idealSittingRoomCount.get());
            if (minRentMatch && MaxRentMatch && bedroomMatch && sittingRoomMatch) {
                System.out.println("有合适房源:"+houseInfo.toString()+"，通知租户：" + name + "，手机号：" + phone);
            }
        }
    }
}
