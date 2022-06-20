package com.jiaolin.factory.abstratfactory.order;


import com.jiaolin.factory.abstratfactory.pizza.Pizza;

/**
 * @author johnny
 * @Classname AbstractFactory
 * @Description
 * @Date 2021/12/27 12:27 下午
 */
public interface AbstractFactory {
    /**
     * @Author johnny
     * @Description  订购披萨
     * @Date 12:28 下午 2021/12/27
     * @Param [orderType]
     * @return factory.simplefactory.pizze.Pizza
     **/
    public Pizza createPizza(String orderType);
}
