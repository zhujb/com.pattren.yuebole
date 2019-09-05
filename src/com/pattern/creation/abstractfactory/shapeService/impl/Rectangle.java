package com.pattern.creation.abstractfactory.shapeService.impl;

import com.pattern.creation.abstractfactory.shapeService.IShapeServce;

/**
 * 定义 矩形，并实现Shape接口
 */
public class Rectangle implements IShapeServce {
    @Override
    public void draw() {
        System.out.println("Rectangle.draw");
    }
}
