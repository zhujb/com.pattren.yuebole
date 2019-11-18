package com.pattern.domain.decoratorpattern.pattern.impl;

import com.pattern.domain.decoratorpattern.pattern.IDecorator;
import com.pattern.domain.decoratorpattern.service.Shape;

public class RedDecorator extends IDecorator {


    public RedDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void exec() {
        shape.draw();
        drawVColor();
    }

    public void drawVColor(){
        System.out.println("RedDecorator.drawVColor===red");
    }
}
