package com.jiaolin.factory.simplefactory.pizza;

// 胡椒披萨
public class ChickenPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备鸡肉披萨");
    }
}
