package com.jiaolin.factory.simplefactory.order;


import com.jiaolin.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 订购披萨
public class OrderPizza2 {

    // 进行静态订购

    Pizza pizza=null;

    public OrderPizza2(){
        setFactory();
    }

    private void setFactory() {
        String  orderType="";
        do {
            orderType=getType();
            pizza = PizzaFactory.createPizza2(orderType);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("没你需要的类型");
                break;
            }

        }while (true);

    }

    private String getType() {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String value = null;
        try {
            System.out.println("input pizza: ");
            value = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }

}
