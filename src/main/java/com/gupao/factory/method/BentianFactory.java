package com.gupao.factory.method;

import com.gupao.factory.BenTianCar;
import com.gupao.factory.ICar;

/**
 * Created by xuhuan on 2019/3/10.
 */
public class BentianFactory implements ICarFactory {
    public ICar create() {
        return new BenTianCar();
    }
}
