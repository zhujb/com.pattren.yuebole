package com.pattern.domain.decoratorpattern.service.impl;

import com.pattern.domain.decoratorpattern.service.Shape;

public class Cilcie implements Shape {

    @Override
    public void draw() {
        System.out.println("Cilcie.draw");
    }
}
