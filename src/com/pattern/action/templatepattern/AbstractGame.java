package com.pattern.action.templatepattern;

public abstract class AbstractGame {
    protected abstract void start();
    protected abstract void stop();

    public final void play(){
        start();
        stop();
    }
}
