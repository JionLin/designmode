package com.jiaolin.classadapter;

/**
 * @author johnny
 * @Classname Client
 * @Description
 * @Date 2022/11/6 17:07
 */
public class Client {
    public static void main(String[] args) {
        Phone phone =
                new Phone();
        phone.charging(new VoltageAdapter());
    }
}
