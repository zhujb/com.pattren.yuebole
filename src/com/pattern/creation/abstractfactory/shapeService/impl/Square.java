package com.pattern.creation.abstractfactory.shapeService.impl;

import com.pattern.creation.abstractfactory.shapeService.IShapeServce;

/**
 * 定义 正方形，并实现Shape接口
 */
public class Square implements IShapeServce {
    @Override
    public void draw() {
        System.out.println("Square.draw");
    }
}
