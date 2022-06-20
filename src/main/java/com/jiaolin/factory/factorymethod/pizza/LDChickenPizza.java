package com.jiaolin.factory.factorymethod.pizza;


// 鸡肉披萨
public class LDChickenPizza extends Pizza {
    @Override
    public void prepare() {
        setName("ld 鸡肉披萨");
        System.out.println("准备伦敦鸡肉披萨");
    }
}
