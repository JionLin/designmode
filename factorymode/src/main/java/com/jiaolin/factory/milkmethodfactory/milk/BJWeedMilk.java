package com.jiaolin.factory.milkmethodfactory.milk;

/**
 * @author johnny
 * @Classname WeedMilk
 * @Description
 * @Date 2022/6/22 11:14
 */
public class BJWeedMilk extends Milk{
    @Override
    public void prepare() {
        setName("北京婚庆蛋糕");

        System.out.println("准备婚庆蛋糕");
    }
}
