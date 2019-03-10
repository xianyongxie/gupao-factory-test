package com.gupao.factory.method;

import com.gupao.factory.ICar;
import com.gupao.factory.WeyCar;

/**
 * Created by xuhuan on 2019/3/10.
 */
public class WeyCarFactory implements ICarFactory {
    public ICar create() {
        return new WeyCar();
    }
}
