package com.pattern.domain.decoratorpattern.pattern;

import com.pattern.domain.decoratorpattern.service.Shape;

public abstract class IDecorator {
    protected Shape shape;

    public IDecorator(Shape shape) {
        this.shape = shape;
    }

    public void exec(){
        System.out.println("装饰器 pre...");
        shape.draw();
        System.out.println("装饰器 post...");
    }
}
