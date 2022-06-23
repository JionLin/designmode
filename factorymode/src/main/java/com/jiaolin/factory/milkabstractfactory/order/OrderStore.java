package com.jiaolin.factory.milkabstractfactory.order;

/**
 * @author johnny
 * @Classname OrderStore
 * @Description
 * @Date 2022/6/23 11:33
 */
public class OrderStore
{
    public static void main(String[] args) {
//        new OrderMilk(new LDFactory());
        new OrderMilk(new BJFactory());
    }
}
