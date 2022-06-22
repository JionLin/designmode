package com.jiaolin.factory.milkmethodfactory.order;

import com.jiaolin.factory.milkmethodfactory.milk.Milk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author johnny
 * @Classname MilkOrder
 * @Description
 * @Date 2022/6/22 11:17
 */
public abstract class MilkOrder {

    public abstract Milk createMilk( String orderType);


    public MilkOrder() {
        do {
            String orderType = getType();
            Milk milk = createMilk(orderType);
            if (milk != null) {
                milk.prepare();
                milk.back();
                milk.cut();
                milk.box();
            } else {
                System.out.println("没你订购的类型");
                break;
            }
        } while (true);


    }

    protected String getType() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza:");
        String value = null;
        try {
            value = bufferedReader.readLine();
            return value;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }
}
