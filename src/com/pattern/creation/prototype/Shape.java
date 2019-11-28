package com.pattern.creation.prototype;

public abstract class Shape implements Cloneable{

    private int id;
    protected String name;

    abstract void draw();//提供给子类自定义


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
