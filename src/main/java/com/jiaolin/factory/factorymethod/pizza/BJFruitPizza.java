package com.jiaolin.factory.factorymethod.pizza;


public class BJFruitPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京水果披萨");
        System.out.println("准备北京水果披萨");
    }
}
