package com.gupao.factory.abastract;

/**
 * Created by xuhuan on 2019/3/10.
 */
public class Test {
    public static void main(String[] args) {
        CatFactory catFactory = new CatFactory();
        catFactory.createRun().run();
        catFactory.createCall().call();

        DogFactory dogFactory = new DogFactory();
        dogFactory.createRun().run();
        dogFactory.createCall().call();
    }
}
