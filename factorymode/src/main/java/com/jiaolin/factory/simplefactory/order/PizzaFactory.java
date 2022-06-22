package com.jiaolin.factory.simplefactory.order;


// 披萨工厂 鸡肉 榴莲 水果
// 手动输入披萨 我就给你什么披萨
// 简单工厂模式 1. 由1个工厂模式来创建产品类的实例 2。定义一个可实例化产品的类,来进行封装其对象的代码。

import com.jiaolin.factory.simplefactory.pizza.ChickenPizza;
import com.jiaolin.factory.simplefactory.pizza.DurianPizza;
import com.jiaolin.factory.simplefactory.pizza.FruitPizza;
import com.jiaolin.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaFactory {


    // 来创建披萨 如果需要胡椒 或者芝士或者 希腊披萨
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("chicken")) {
            pizza = new ChickenPizza();
            pizza.setName("鸡肉披萨");
        } else if (orderType.equals("fruit")) {
            pizza = new FruitPizza();
            pizza.setName("fruitPizza");
        } else if (orderType.equals("durian")) {
            pizza = new DurianPizza();
            pizza.setName("榴莲披萨");
        }
        return pizza;
    }

    // 静态方法创建
    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("chicken")) {
            pizza = new ChickenPizza();
            pizza.setName("鸡肉披萨");
        } else if (orderType.equals("fruit")) {
            pizza = new FruitPizza();
            pizza.setName("水果披萨");
        } else if (orderType.equals("durian")) {
            pizza = new DurianPizza();
            pizza.setName("榴莲披萨");
        }
        return pizza;
    }

    private String getType() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String value = null;
        System.out.println("input pizza:");
        try {
            value = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return value;
    }


}
