package com.jiaolin.factory.milkabstractfactory.milk;


/**
 * @author johnny
 * @Classname BJBrithMilk
 * @Description
 * @Date 2022/6/22 11:38
 */
public class BJBrithMilk  extends Milk {
    @Override
    public void prepare() {
        setName("北京生日蛋糕");
        System.out.println("准备生日蛋糕");
    }
}
