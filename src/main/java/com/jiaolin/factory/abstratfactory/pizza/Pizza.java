package com.jiaolin.factory.abstratfactory.pizza;

/**
 * @author johnny
 * @Classname Pizza
 * @Description
 * @Date 2021/12/27 12:23 下午
 */
public abstract class Pizza {
    protected String name;


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
