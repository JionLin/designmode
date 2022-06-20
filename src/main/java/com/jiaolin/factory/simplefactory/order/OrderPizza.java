package com.jiaolin.factory.simplefactory.order;


import com.jiaolin.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 订购披萨
public class OrderPizza {


    Pizza pizza = null;

    PizzaFactory pizzaFactory;

    public OrderPizza(PizzaFactory pizzaFactory) {
        setFactory(pizzaFactory);
    }

    private void setFactory(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
        String orderType = "";
        do {
            orderType = getType();
             pizza = this.pizzaFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("没有你输入的类型");
                break;
            }

        } while (true);
    }

    // 输入什么类型的
    private String getType() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza: ");
        String value = null;
        try {
            value = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }

}
