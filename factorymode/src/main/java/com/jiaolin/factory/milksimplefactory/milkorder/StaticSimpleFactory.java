package com.jiaolin.factory.milksimplefactory.milkorder;

import com.jiaolin.factory.milksimplefactory.milk.BirthdayMilk;
import com.jiaolin.factory.milksimplefactory.milk.Milk;
import com.jiaolin.factory.milksimplefactory.milk.WeddingCake;

/**
 * @author johnny
 * @Classname SimpleFactory
 * @Description 核心在这 由简单工厂来决定创建出来为哪一类的产品
 * @Date 2022/6/22 10:06
 */
public class StaticSimpleFactory {

    public static Milk createMilk(String orderType) {
        Milk milk = null;

        System.out.println("使用简单工厂模式");
        if (orderType.equals("birth")) {
            milk = new BirthdayMilk();
            milk.setName("生日蛋糕");
        } else if (orderType.equals("wedd")) {
            milk = new WeddingCake();
            milk.setName("婚庆蛋糕");
        } else {
            System.out.println("类型订购错误");
        }
        return milk;
    }


}
