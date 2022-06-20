package com.jiaolin.factory.abstratfactory.order;


import com.jiaolin.factory.abstratfactory.pizza.LDChickenPizza;
import com.jiaolin.factory.abstratfactory.pizza.LDFruitPizza;
import com.jiaolin.factory.abstratfactory.pizza.Pizza;

/**
 * @author johnny
 * @Classname LDPizza
 * @Description
 * @Date 2021/12/27 12:26 下午
 */
public class LDOrderPizza implements AbstractFactory{



    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if (orderType.equals("fruit")){
            pizza=new LDFruitPizza();
        }else if (orderType.equals("chicken")){
            pizza=new LDChickenPizza();
        }

        return pizza;
    }
}
