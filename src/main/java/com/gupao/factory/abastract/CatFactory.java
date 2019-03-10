package com.gupao.factory.abastract;

/**
 * Created by xuhuan on 2019/3/10.
 */
public class CatFactory implements AnimalFactory {
    public IRun createRun() {
        return new CatRun();
    }

    public ICall createCall() {
        return new CatCall();
    }
}
