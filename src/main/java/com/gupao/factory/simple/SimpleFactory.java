package com.gupao.factory.simple;

import com.gupao.factory.BenTianCar;
import com.gupao.factory.ICar;
import com.gupao.factory.WeyCar;
import com.gupao.factory.XiandaiCar;

/**
 * Created by xuhuan on 2019/3/10.
 */
public class SimpleFactory {
    public static final String WEY = "wey";
    public static final String BENTIAN = "本田";
    public static final String XIANDAI = "现代";

    //普通方式
    public static ICar createCar(String carName){
       if (carName.equals(WEY)){
           return new WeyCar();
       }else if (carName.equals(BENTIAN)) {
           return new BenTianCar();
       }else if (carName.equals(XIANDAI)){
           return new XiandaiCar();
       }else return null;
    }

    //使用反射
    public ICar createCar(Class<? extends ICar> clazz){
        try {
            if(clazz!=null){
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
