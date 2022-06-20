package com.jiaolin.factory.factorymethod.order;

/**
 * @author johnny
 * @Classname OrderStore
 * @Description 订购商店
 * @Date 2021/12/27 9:18 上午
 */
public class OrderStore {

    public static void main(String[] args) {
        String local = "ld";
        if (local.equals("bj")) {
            new BJOrderPizza();
        } else if (local.equals("ld")) {
            new LDOrderPizza();
        }
    }
}
