package com.pattern.creation.prototype;

public class Circle extends Shape {

    public Circle() {
        name="圆";
    }

    @Override
    void draw() {
        System.out.println("name = " + name);
    }
}
