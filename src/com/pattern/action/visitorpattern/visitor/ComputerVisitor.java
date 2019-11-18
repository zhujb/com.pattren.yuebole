package com.pattern.action.visitorpattern.visitor;

import com.pattern.action.visitorpattern.service.impl.KeyBoard;
import com.pattern.action.visitorpattern.service.impl.Monitor;

public interface ComputerVisitor {

    public void publicEvent(KeyBoard computer);
    public void publicEvent(Monitor computer);

}
