package com.jiaolin.factory.simplefactory.pizza;

// 订购披萨 需要准备原材料
// 烘烤  准备
// 切割 prepare
// 装盒 box
public abstract class Pizza {
    private String name;

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
