package com.jiaolin.factory.simplefactory.pizza;

public class FruitPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备水果披萨");
    }
}
