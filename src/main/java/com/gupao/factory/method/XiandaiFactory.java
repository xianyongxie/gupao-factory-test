package com.gupao.factory.method;

import com.gupao.factory.ICar;
import com.gupao.factory.XiandaiCar;

/**
 * Created by xuhuan on 2019/3/10.
 */
public class XiandaiFactory implements ICarFactory {
    public ICar create() {
        return new XiandaiCar();
    }
}
