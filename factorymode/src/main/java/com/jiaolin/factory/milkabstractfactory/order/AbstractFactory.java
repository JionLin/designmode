package com.jiaolin.factory.milkabstractfactory.order;

import com.jiaolin.factory.milkabstractfactory.milk.Milk;

/**
 * @author johnny
 * @Classname AbstractFactory
 * @Description
 * @Date 2022/6/23 11:18
 */
public interface AbstractFactory {
    Milk createMilk(String orderType);
}
