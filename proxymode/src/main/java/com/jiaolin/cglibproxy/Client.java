package com.jiaolin.cglibproxy;

/**
 * @author johnny
 * @Classname Client
 * @Description
 * @Date 2022/6/23 16:58
 */
public class Client {
    public static void main(String[] args) {
        // 创建目标类
        TeacherDao teacherDao = new TeacherDao();

        // 根据目标类,创建代理类,根据代理类 调用目标类的方法。
        TeacherDao proxyInstance = (TeacherDao) new TeacherDaoProxy(teacherDao).getProxyInstance();

        String teach = proxyInstance.teach();
        System.out.println("teach: " + teach);

    }
}
