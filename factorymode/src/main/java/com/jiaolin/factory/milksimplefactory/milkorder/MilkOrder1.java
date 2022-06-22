package com.jiaolin.factory.milksimplefactory.milkorder;

import com.jiaolin.factory.milksimplefactory.milk.Milk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author johnny
 * @Classname MilkOrder1
 * @Description
 * @Date 2022/6/22 10:06
 */
public class MilkOrder1 {

    Milk milk = null;

    public MilkOrder1() {
        setFactory();
    }

    private void setFactory() {
        do {
            String type = getType();
            milk = StaticSimpleFactory.createMilk(type);
            if (milk != null) {
                milk.prepare();
                milk.back();
                milk.cut();
                milk.box();
            } else {
                System.out.println("没有你订购的类型");
                break;
            }
        } while (true);
    }

    private static String getType() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String value = null;
        System.out.println("input pizza:");
        try {
            value = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return value;
    }

}
