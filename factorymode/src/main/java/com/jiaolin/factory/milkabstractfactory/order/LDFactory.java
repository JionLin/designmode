package com.jiaolin.factory.milkabstractfactory.order;

import com.jiaolin.factory.milkabstractfactory.milk.LDBrithdayMilk;
import com.jiaolin.factory.milkabstractfactory.milk.LDWeedMilk;
import com.jiaolin.factory.milkabstractfactory.milk.Milk;

/**
 * @author johnny
 * @Classname LDFactory
 * @Description
 * @Date 2022/6/23 11:19
 */
public class LDFactory implements AbstractFactory {

    @Override
    public Milk createMilk(String orderType) {
        Milk milk = null;
        if (orderType.equals("birth")) {
            milk = new LDBrithdayMilk();
        } else if (orderType.equals("weed")) {
            milk = new LDWeedMilk();
        }

        return milk;
    }
}
