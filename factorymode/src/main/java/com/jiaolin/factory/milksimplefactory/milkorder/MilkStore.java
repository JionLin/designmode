package com.jiaolin.factory.milksimplefactory.milkorder;

/**
 * @author johnny
 * @Classname MilkStore
 * @Description
 * @Date 2022/6/22 10:14
 */
public class MilkStore {
    public static void main(String[] args) {
//        new  MilkOrder1();

        new MilkOrder2(new SimpleFactory());
    }
}
