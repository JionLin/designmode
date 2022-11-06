package com.jiaolin.classadapter;

/**
 * @author johnny
 * @Classname VoltageAdapter
 * @Description
 * @Date 2022/11/6 17:00
 */
public class VoltageAdapter extends Voltage220V implements Ivoltage5V{

    @Override
    public int output5V() {
        int result = output220V();
        int value = result / 44;
        return value;

    }
}
