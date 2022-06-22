package com.jiaolin.factory.milkmethodfactory.milk;

/**
 * @author johnny
 * @Classname Milk
 * @Description
 * @Date 2022/6/22 11:13
 */
public abstract class Milk {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public abstract void prepare();

    public void back(){
        System.out.println(name+": 烘烤");
    }
    public void cut(){
        System.out.println(name+": 切割");
    }
    public void box(){
        System.out.println(name+": 打包");
    }
}
