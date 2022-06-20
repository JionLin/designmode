package com.jiaolin.factory.abstratfactory.order;


import com.jiaolin.factory.abstratfactory.pizza.BJChickenPizza;
import com.jiaolin.factory.abstratfactory.pizza.BJFruitPizza;
import com.jiaolin.factory.abstratfactory.pizza.Pizza;

/**
 * @author johnny
 * @Classname BJOrderPizza
 * @Description
 * @Date 2021/12/27 12:27 下午
 */
public class BJOrderPizza implements AbstractFactory {



    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("chicken")) {
            pizza = new BJChickenPizza();
        } else if (orderType.equals("fruit")) {
            pizza = new BJFruitPizza();
        }
        return pizza;
    }
}
