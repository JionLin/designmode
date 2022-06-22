package com.jiaolin.factory.milkmethodfactory.order;

import com.jiaolin.factory.milkmethodfactory.milk.BJBrithMilk;
import com.jiaolin.factory.milkmethodfactory.milk.BJWeedMilk;
import com.jiaolin.factory.milkmethodfactory.milk.Milk;

/**
 * @author johnny
 * @Classname BJMilkOrder
 * @Description
 * @Date 2022/6/22 11:26
 */
public class BJMilkOrder extends MilkOrder {
    @Override
    public Milk createMilk(String orderType) {
        Milk milk = null;
        if (orderType.equals("birth")) {
            milk = new BJBrithMilk();
        } else if (orderType.equals("weed")) {
            milk = new BJWeedMilk();
        }
        return milk;
    }
}
