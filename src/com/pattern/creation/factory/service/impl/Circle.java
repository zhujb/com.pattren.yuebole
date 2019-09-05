package com.pattern.creation.factory.service.impl;

import com.pattern.creation.factory.service.Shape;
/**
 * 定义 圆形，并实现Shape接口
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw");
    }
}
