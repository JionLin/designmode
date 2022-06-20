package com.jiaolin.factory.factorymethod.order;

import com.jiaolin.factory.factorymethod.pizza.LDChickenPizza;
import com.jiaolin.factory.factorymethod.pizza.LDFruitPizza;
import com.jiaolin.factory.factorymethod.pizza.Pizza;

/**
 * @author johnny
 * @Classname LDOrderPizza
 * @Description
 * @Date 2021/12/27 9:13 上午
 */
public class LDOrderPizza extends OrderPizza {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("chicken")){
            pizza=new LDChickenPizza();
        }else  if (orderType.equals("fruit")){
            pizza=new LDFruitPizza();
        }
        return pizza;
    }
}
