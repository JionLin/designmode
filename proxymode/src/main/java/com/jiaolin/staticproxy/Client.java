package com.jiaolin.staticproxy;

/**
 * @author johnny
 * @Classname Client
 * @Description
 * @Date 2022/6/23 15:16
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        teacherDaoProxy.teach();

    }
}
