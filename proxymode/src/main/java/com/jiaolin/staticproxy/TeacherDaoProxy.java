package com.jiaolin.staticproxy;

/**
 * @author johnny
 * @Classname TeacherDaoProxy
 * @Description
 * @Date 2022/6/23 15:15
 */
public class TeacherDaoProxy implements ITeachDao{

    ITeachDao iTeachDao;

    public TeacherDaoProxy(ITeachDao iTeachDao) {
        this.iTeachDao = iTeachDao;
    }

    @Override
    public void teach() {
        System.out.println("目标对象开始。。。");
        iTeachDao.teach();
        System.out.println("目标对象结束。。。");
    }
}
