package com.pattern.action.visitorpattern.service;

import com.pattern.action.visitorpattern.visitor.ComputerVisitor;

public interface IComputer {

    void accept(ComputerVisitor computerVisitor);//需要填充访问器
}
