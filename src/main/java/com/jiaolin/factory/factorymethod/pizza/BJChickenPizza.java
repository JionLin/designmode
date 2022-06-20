package com.jiaolin.factory.factorymethod.pizza;


// 鸡肉披萨
public class BJChickenPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京鸡肉披萨");
        System.out.println("准备北京鸡肉披萨");
    }
}
