package com.jiaolin;

/**
 * @author johnny
 * @Classname EagerSingleTon
 * @Description 饿汉式 立即加载,
 * 单例 属于创建型类型
 * 1。用来需要经常创建和销毁的对象
 * 2。对象耗时比较长的
 * 3。用于频繁访问数据库的对象
 * @Date 2022/6/20 16:00
 */
public class EagerSingleTon {
    public static void main(String[] args) {
        System.out.println("饿汉式");
        SingleTon1 singleTon = SingleTon1.getInstance();
        SingleTon1 singleTon2 = SingleTon1.getInstance();

        System.out.println(singleTon == singleTon2);
        System.out.println(singleTon.hashCode());
        System.out.println(singleTon2.hashCode());
    }
}

class SingleTon1 {
    private static final SingleTon1 instance = new SingleTon1();

    private SingleTon1() {
    }

    public static SingleTon1 getInstance() {
        return instance;
    }
}
