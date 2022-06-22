package com.jiaolin.factory.milksimplefactory.milkorder;

import com.jiaolin.factory.milksimplefactory.milk.Milk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author johnny
 * @Classname MilkOrder2
 * @Description
 * @Date 2022/6/22 10:06
 */
public class MilkOrder2 {

    SimpleFactory simpleFactory;
    Milk milk = null;

    public MilkOrder2(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
        setFactory(simpleFactory);
    }

    private void setFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
        do {
            String orderType = getType();
            milk = simpleFactory.createFactory(orderType);
            if (milk != null) {
                milk.prepare();
                milk.back();
                milk.cut();
                milk.box();
            } else {
                System.out.println("订购类型错误");
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
