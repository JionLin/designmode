package com.jiaolin;

/**
 * @author johnny
 * @Classname DclSingleton
 * @Description 单例设计模式的介绍: 某个类只存在一个对象实例,且对外只提供一个访问对象的静态方法。
 * dcl 双重检查机制
 * @Date 2022/6/20 15:15
 */
public class DclSingleton {
    public static void main(String[] args) {
        System.out.println("双重锁检查");
        SingleTon singleTon = SingleTon.getInstance();
        SingleTon singleTon2 = SingleTon.getInstance();

        System.out.println(singleTon == singleTon2);
        System.out.println(singleTon.hashCode());
        System.out.println(singleTon2.hashCode());
    }
}

class SingleTon {
    //    volatile 关键字 可见性 禁止指令重排 不保证原子性
    private static volatile SingleTon instance;

    private SingleTon() {
    }

    public static SingleTon getInstance() {
        if (instance == null) {
            synchronized (SingleTon.class) {
                instance = new SingleTon();
            }
        }
        return instance;
    }
}