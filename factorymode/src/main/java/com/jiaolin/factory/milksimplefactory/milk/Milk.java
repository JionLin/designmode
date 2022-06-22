package com.jiaolin.factory.milksimplefactory.milk;

/**
 * @author johnny
 * @Classname Milk
 * @Description 蛋糕
 * @Date 2022/6/22 09:53
 */
public abstract class Milk {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public void back() {
        System.out.println(name + "烘烤");
    }

    public void cut() {
        System.out.println(name + "切割");
    }

    public void box() {
        System.out.println(name + "打包");
    }
}
