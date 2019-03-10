package com.gupao.factory.abastract;

/**
 * Created by xuhuan on 2019/3/10.
 */
public interface AnimalFactory {
    IRun createRun();
    ICall createCall();
}
