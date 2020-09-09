package com.ali.interview;

import java.math.BigDecimal;
import java.util.Optional;

import com.ali.interview.entity.HouseInfo;
import com.ali.interview.renting.IntermediaryAgent;
import com.ali.interview.renting.Tenant;

/**
 * 测试类
 * @Author hao.wang
 * @Date 2020/9/9 11:05
 */
public class App {
    public static void main(String[] args) {
        Tenant xiaoming = new Tenant("小明", "15333311311",Optional.empty(), Optional.of(BigDecimal.valueOf(6000)), Optional.of(3), Optional.of(2));
        Tenant xiaozhang = new Tenant("小张", "12233331131",Optional.empty(), Optional.of(BigDecimal.valueOf(1500)), Optional.empty(), Optional.empty());
        IntermediaryAgent intermediaryAgent = new IntermediaryAgent();
        intermediaryAgent.registerObserver(xiaoming);
        intermediaryAgent.registerObserver(xiaozhang);

        HouseInfo houseInfo1 = new HouseInfo( BigDecimal.valueOf(1200),1,2);
        intermediaryAgent.setInfomation(houseInfo1);
        
        HouseInfo houseInfo2 = new HouseInfo( BigDecimal.valueOf(7000),3,2);
        intermediaryAgent.setInfomation(houseInfo2);
        
        HouseInfo houseInfo3 = new HouseInfo( BigDecimal.valueOf(1200),3,2);
        intermediaryAgent.setInfomation(houseInfo3);
        
        HouseInfo houseInfo4 = new HouseInfo( BigDecimal.valueOf(4000),3,2);
        intermediaryAgent.setInfomation(houseInfo4);
        
        HouseInfo houseInfo5 = new HouseInfo( BigDecimal.valueOf(4000),1,2);
        intermediaryAgent.setInfomation(houseInfo5);
    }
}
