package com.pattern.action.strategypattern.context;

public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void exec(int a,int b){
        strategy.exec(a,b);
    }
}
