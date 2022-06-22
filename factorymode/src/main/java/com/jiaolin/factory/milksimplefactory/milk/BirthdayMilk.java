package com.jiaolin.factory.milksimplefactory.milk;

/**
 * @author johnny
 * @Classname BirthdayMilk
 * @Description
 * @Date 2022/6/22 09:53
 */
public class BirthdayMilk extends Milk {
    @Override
    public void prepare() {
        System.out.println("准备生日蛋糕");
    }
}
