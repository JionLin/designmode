package com.jiaolin.factory.milkabstractfactory.order;

import com.jiaolin.factory.milkabstractfactory.milk.Milk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author johnny
 * @Classname MilkOrder
 * @Description
 * @Date 2022/6/22 15:03
 */
public  class OrderMilk {

    AbstractFactory abstractFactory;

    public OrderMilk(AbstractFactory abstractFactory){
       setAbstractFactory(abstractFactory);
    }

    private void setAbstractFactory(AbstractFactory abstractFactory) {
        this.abstractFactory=abstractFactory;
        do {
            String orderType=getType();
            Milk milk = abstractFactory.createMilk(orderType);
            if (milk != null) {
                milk.prepare();
                milk.back();
                milk.cut();
                milk.box();
            }else {
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
