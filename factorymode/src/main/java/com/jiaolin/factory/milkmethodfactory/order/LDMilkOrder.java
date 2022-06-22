package com.jiaolin.factory.milkmethodfactory.order;

import com.jiaolin.factory.milkmethodfactory.milk.LDBrithdayMilk;
import com.jiaolin.factory.milkmethodfactory.milk.LDWeedMilk;
import com.jiaolin.factory.milkmethodfactory.milk.Milk;

/**
 * @author johnny
 * @Classname LDMilkOrder
 * @Description
 * @Date 2022/6/22 11:25
 */
public class LDMilkOrder extends MilkOrder {
    @Override
    public Milk createMilk(String orderType) {
        Milk milk=null;
        if (orderType.equals("birth")) {
            milk=new LDBrithdayMilk();
        } else if (orderType.equals("weed")) {
            milk=new LDWeedMilk();
        }
        return milk;
    }
}
