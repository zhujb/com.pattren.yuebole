package com.pattern.creation.factory.service.impl;

import com.pattern.creation.factory.service.Shape;
/**
 * 定义 正方形，并实现Shape接口
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw");
    }
}
