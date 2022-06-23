package com.jiaolin.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author johnny
 * @Classname TeacherDaoProxy
 * @Description
 * @Date 2022/6/23 16:59
 */
public class TeacherDaoProxy implements MethodInterceptor {

    private Object target;

    public TeacherDaoProxy(Object target) {
        this.target = target;
    }

    // 返回一个代理对象
    public Object getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("cglib 开始");
        Object invoke = method.invoke(target, args);
        System.out.println("cglib 提交");
        return invoke;
    }
}
