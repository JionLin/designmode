package com.jiaolin.factory.simplefactory.pizza;

public class DurianPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备榴莲披萨");
    }
}
