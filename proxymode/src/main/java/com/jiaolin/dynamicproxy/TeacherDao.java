package com.jiaolin.dynamicproxy;

/**
 * @author johnny
 * @Classname TeacherDap
 * @Description
 * @Date 2022/6/23 15:43
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("动态代理 老师授课中");
    }
}
