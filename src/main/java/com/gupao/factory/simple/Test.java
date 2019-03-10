package com.gupao.factory.simple;

import com.gupao.factory.BenTianCar;
import com.gupao.factory.ICar;
import com.gupao.factory.WeyCar;
import com.gupao.factory.XiandaiCar;

/**
 * Created by xuhuan on 2019/3/10.
 */
public class Test {

    public static void main(String[] args) {
        ICar wey = SimpleFactory.createCar(SimpleFactory.WEY);
        wey.desc();

        ICar bentian = SimpleFactory.createCar(SimpleFactory.BENTIAN);
        bentian.desc();

        ICar xiandai = SimpleFactory.createCar(SimpleFactory.XIANDAI);
        xiandai.desc();

        //反射方式
        SimpleFactory factory = new SimpleFactory();
        factory.createCar(WeyCar.class).desc();
        factory.createCar(BenTianCar.class).desc();
        factory.createCar(XiandaiCar.class).desc();
    }
}
