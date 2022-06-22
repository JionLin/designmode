package com.jiaolin.factory.milkabstractfactory.milk;


/**
 * @author johnny
 * @Classname BirthdayMilk
 * @Description
 * @Date 2022/6/22 11:14
 */
public class LDWeedMilk extends Milk {
    @Override
    public void prepare() {
        setName("伦敦婚庆蛋糕");
        System.out.println("准备生日蛋糕");
    }
}
