package com.jiaolin.factory.milkabstractfactory.order;

import com.jiaolin.factory.milkabstractfactory.milk.BJBrithMilk;
import com.jiaolin.factory.milkabstractfactory.milk.BJWeedMilk;
import com.jiaolin.factory.milkabstractfactory.milk.Milk;

/**
 * @author johnny
 * @Classname BJFactory
 * @Description
 * @Date 2022/6/23 11:20
 */
public class BJFactory implements AbstractFactory{
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
