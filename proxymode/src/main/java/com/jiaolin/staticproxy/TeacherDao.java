package com.jiaolin.staticproxy;

/**
 * @author johnny
 * @Classname TeacherDao
 * @Description
 * @Date 2022/6/23 15:13
 */
public class TeacherDao implements ITeachDao{

    @Override
    public void teach() {
        System.out.println("老师授课中");
    }
}
