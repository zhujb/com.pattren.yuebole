package com.pattern.creation.factory.service.impl;

import com.pattern.creation.factory.service.Shape;

/**
 * 定义 矩形，并实现Shape接口
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle.draw");
    }
}
