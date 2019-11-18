package com.pattern.action.visitorpattern.visitor.impl;

import com.pattern.action.visitorpattern.service.impl.KeyBoard;
import com.pattern.action.visitorpattern.service.impl.Monitor;
import com.pattern.action.visitorpattern.visitor.ComputerVisitor;

public class ComputerVisitorImpl implements ComputerVisitor {
    @Override
    public void publicEvent(KeyBoard computer) {
        System.out.println("KeyBoard = [" + computer + "]");
    }

    @Override
    public void publicEvent(Monitor computer) {
        System.out.println("Monitor = [" + computer + "]");
    }

}
