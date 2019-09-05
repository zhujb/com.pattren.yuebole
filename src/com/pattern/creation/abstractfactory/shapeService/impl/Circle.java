package com.pattern.creation.abstractfactory.shapeService.impl;

import com.pattern.creation.abstractfactory.shapeService.IShapeServce;

/**
 * 定义 圆形，并实现Shape接口
 */
public class Circle implements IShapeServce {
    @Override
    public void draw() {
        System.out.println("Circle.draw");
    }
}
