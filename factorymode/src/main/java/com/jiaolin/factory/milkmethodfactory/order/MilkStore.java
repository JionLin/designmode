package com.jiaolin.factory.milkmethodfactory.order;

/**
 * @author johnny
 * @Classname MilkStore
 * @Description
 * @Date 2022/6/22 14:01
 */
public class MilkStore {
    public static void main(String[] args) {
        String loc = "bj2";
        if (loc.equals("bj")) {
            //创建北京口味的各种Pizza
            new BJMilkOrder();
        } else {
            //创建伦敦口味的各种Pizza
            new LDMilkOrder();
        }
    }
}
