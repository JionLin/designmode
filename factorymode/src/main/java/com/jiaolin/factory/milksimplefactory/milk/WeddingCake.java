package com.jiaolin.factory.milksimplefactory.milk;

/**
 * @author johnny
 * @Classname WeddingCake
 * @Description
 * @Date 2022/6/22 09:58
 */
public class WeddingCake extends Milk{
    @Override
    public void prepare() {
        System.out.println("准备婚庆蛋糕");
    }
}
