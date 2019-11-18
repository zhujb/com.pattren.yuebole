package com.pattern.action.templatepattern.subtype;

import com.pattern.action.templatepattern.AbstractGame;

public class Cricket extends AbstractGame {
    @Override
    protected void start() {
        System.out.println("Cricket.start");
    }

    @Override
    protected void stop() {
        System.out.println("Cricket.stop");
    }
}
