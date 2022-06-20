package com.jiaolin.factory.abstratfactory.order;


import com.jiaolin.factory.abstratfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author johnny
 * @Classname OrderPizza
 * @Description
 * @Date 2021/12/27 12:26 下午
 */
public class OrderPizza {

    AbstractFactory abstractFactory;


    public OrderPizza(AbstractFactory abstractFactory) {
        setAbstractFactory(abstractFactory);
    }

    private void setAbstractFactory(AbstractFactory abstractFactory) {
        this.abstractFactory=abstractFactory;
        String orderType = "";
        do {
            orderType = getType();
            Pizza pizza = abstractFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("没有你订购的类型");
                break;
            }
        } while (true);
    }

    private String getType() {
        String value;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza:");
        try {
            value = bufferedReader.readLine();
            return value;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }


}
