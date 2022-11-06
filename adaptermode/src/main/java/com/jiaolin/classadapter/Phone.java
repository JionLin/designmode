package com.jiaolin.classadapter;

/**
 * @author johnny
 * @Classname Phone
 * @Description
 * @Date 2022/11/6 13:38
 */
public class Phone {
    public void  charging(Ivoltage5V ivoltage5V){
        if (ivoltage5V.output5V()==5){
            System.out.println("输出5v");
        }else {
            System.out.println("不是输出5v 不能充电");
        }

    }
}
