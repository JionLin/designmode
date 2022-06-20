package com.jiaolin.factory.factorymethod.order;


import com.jiaolin.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author johnny
 * @Classname OrderStore
 * @Description
 * @Date 2021/12/27 9:00 上午
 */
public abstract class OrderPizza {

    public abstract Pizza createPizza(String orderType);


    public  OrderPizza() {
        String orderType;
        Pizza pizza;
        do {
            orderType = getType();
            pizza = createPizza(orderType);
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("没有你需要的类型");
                break;
            }

        } while (true);
    }

    protected String getType() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza:");
        String value = null;
        try {
            value = bufferedReader.readLine();
            return value;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }


}
