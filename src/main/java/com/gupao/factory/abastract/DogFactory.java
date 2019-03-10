package com.gupao.factory.abastract;

/**
 * Created by xuhuan on 2019/3/10.
 */
public class DogFactory implements AnimalFactory {
    public IRun createRun() {
        return new DogRun();
    }

    public ICall createCall() {
        return new DogCall();
    }
}
