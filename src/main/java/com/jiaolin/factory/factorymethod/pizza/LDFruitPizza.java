package com.jiaolin.factory.factorymethod.pizza;


public class LDFruitPizza extends Pizza {


    @Override
    public void prepare() {
        setName("ld 水果披萨");
        System.out.println("准备伦敦水果披萨");
    }
}
