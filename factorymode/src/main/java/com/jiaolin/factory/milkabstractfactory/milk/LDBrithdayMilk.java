package com.jiaolin.factory.milkabstractfactory.milk;


/**
 * @author johnny
 * @Classname LDBrithdayMilk
 * @Description
 * @Date 2022/6/22 11:39
 */
public class LDBrithdayMilk extends Milk {
    @Override
    public void prepare() {
        setName("伦敦生日蛋糕");

        System.out.println("准备生日蛋糕");
    }
}