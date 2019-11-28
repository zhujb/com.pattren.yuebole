package com.pattern.creation.prototype;

public class Rectangle extends Shape {

    public Rectangle() {
        name="方";
    }

    @Override
    void draw() {
        System.out.println("name = " + name);
    }
}
