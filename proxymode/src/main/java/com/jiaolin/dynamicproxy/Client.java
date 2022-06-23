package com.jiaolin.dynamicproxy;

/**
 * @author johnny
 * @Classname Client
 * @Description
 * @Date 2022/6/23 16:11
 */
public class Client {
    public static void main(String[] args) {
        // 维护一个目标对象
        ITeacherDao teacherDao=new TeacherDao();
        // 根据目标对象,返回一个代理对象,使用的是反射机制
        ITeacherDao object = (ITeacherDao) new TeacherDaoProxy(teacherDao).getInstance();
        // 根据代理对象,调用目标对象的方法
        object.teach();


    }
}
