package com.jiaolin.factory.abstratfactory.order;

/**
 * @author johnny
 * @Classname OrderStore
 * @Description
 * @Date 2021/12/27 12:25 下午
 */
public class OrderStore {
    public static void main(String[] args) {
        new OrderPizza(new LDOrderPizza());
//        new OrderPizza(new BJOrderPizza());

    }
}
