package com.pattern.action.visitorpattern.service.impl;

import com.pattern.action.visitorpattern.service.IComputer;
import com.pattern.action.visitorpattern.visitor.ComputerVisitor;

public class Monitor implements IComputer {
    @Override
    public void accept(ComputerVisitor computerVisitor) {
        computerVisitor.publicEvent(this);
    }
}
