package com.pattern.action.templatepattern.subtype;

import com.pattern.action.templatepattern.AbstractGame;

public class Football extends AbstractGame {
    @Override
    protected void start() {
        System.out.println("Football.start");
    }

    @Override
    protected void stop() {
        System.out.println("Football.stop");
    }
}
