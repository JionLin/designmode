package com.jiaolin.interfaceadapter;

/**
 * @author johnny
 * @Classname Client
 * @Description
 * @Date 2022/11/6 14:03
 */
public class Client {
    public static void main(String[] args) {
        AbstractInterface abstractInterface = new AbstractInterface(){
            @Override
            public void m1() {
                System.out.println("m1");
            }
        };
        abstractInterface.m1();
    }
}
