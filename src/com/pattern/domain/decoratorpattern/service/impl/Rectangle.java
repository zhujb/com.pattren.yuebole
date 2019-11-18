package com.pattern.domain.decoratorpattern.service.impl;

import com.pattern.domain.decoratorpattern.service.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle.draw");
    }
}
