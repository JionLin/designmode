package com.jiaolin.dynamicproxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author johnny
 * @Classname TeacherDaoProxy
 * @Description
 * @Date 2022/6/23 15:44
 */
public class TeacherDaoProxy {

    private Object target;

    public TeacherDaoProxy(Object target) {
        this.target = target;
    }

    public Object getInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                (Object proxy, Method method, Object[] args) -> {
                    System.out.println("jdk 代理开始");
                    Object invoke = method.invoke(target, args);
                    System.out.println("代理提交");
                    return invoke;
                });
    }
}
