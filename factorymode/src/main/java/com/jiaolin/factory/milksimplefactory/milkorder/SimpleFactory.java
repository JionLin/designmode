package com.jiaolin.factory.milksimplefactory.milkorder;

import com.jiaolin.factory.milksimplefactory.milk.BirthdayMilk;
import com.jiaolin.factory.milksimplefactory.milk.Milk;
import com.jiaolin.factory.milksimplefactory.milk.WeddingCake;

/**
 * @author johnny
 * @Classname SimpleFactory
 * @Description
 * @Date 2022/6/22 10:33
 */
public class SimpleFactory {


    public Milk createFactory(String orderType) {
        Milk milk = null;
        if (orderType.equals("birth")) {
            milk = new BirthdayMilk();
            milk.setName("生日蛋糕：");
        } else if (orderType.equals("wedd")) {
            milk = new WeddingCake();
            milk.setName("婚庆蛋糕：");
        }
        return milk;
    }

}
