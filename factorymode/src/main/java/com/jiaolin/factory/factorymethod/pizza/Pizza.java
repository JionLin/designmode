package com.jiaolin.factory.factorymethod.pizza;

/**
 * @Classname Pizza
 * @Description
 * @Date 2021/12/27 8:51 上午
 * @Created by johnny
 */
public  abstract class Pizza {
    public  String name;

    public abstract void prepare();


    public void bake() {
        System.out.println(name + "准备烘烤");
    }

    public void cut() {
        System.out.println(name + "准备解签");
    }

    public void box() {
        System.out.println(name + "准备装盒");
    }


    public void setName(String name) {
        this.name = name;
    }
}
