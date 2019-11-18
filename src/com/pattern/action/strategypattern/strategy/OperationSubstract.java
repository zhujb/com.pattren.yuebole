package com.pattern.action.strategypattern.strategy;

import com.pattern.action.strategypattern.context.IStrategy;

public class OperationSubstract implements IStrategy {
    @Override
    public void exec(int a, int b) {
        System.out.println(a-b);
    }
}
