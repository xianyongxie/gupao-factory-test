package com.gupao.factory.method;

import com.gupao.factory.ICar;

/**
 * Created by xuhuan on 2019/3/10.
 */
public class Test {
    public static void main(String[] args) {
        ICarFactory weyFactory = new WeyCarFactory();
        ICar wey = weyFactory.create();
        wey.desc();

        ICarFactory bentianFactory = new BentianFactory();
        ICar bentian = bentianFactory.create();
        bentian.desc();

        ICarFactory xiandaiFactory = new XiandaiFactory();
        ICar xiandai = xiandaiFactory.create();
        xiandai.desc();
    }
}
