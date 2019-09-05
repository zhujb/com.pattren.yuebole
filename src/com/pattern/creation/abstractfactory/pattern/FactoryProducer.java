package com.pattern.creation.abstractfactory.pattern;

import com.pattern.creation.abstractfactory.pattern.impl.AbstractColorFactory;
import com.pattern.creation.abstractfactory.pattern.impl.AbstractShapeFactory;

/**
 * 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new AbstractShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new AbstractColorFactory();
        }
        return null;
    }
}
