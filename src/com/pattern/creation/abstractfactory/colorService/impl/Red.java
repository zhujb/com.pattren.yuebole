package com.pattern.creation.abstractfactory.colorService.impl;

import com.pattern.creation.abstractfactory.colorService.IColorService;

/**
 * 定义红色并实现IColorService接口
 */
public class Red implements IColorService {
    @Override
    public void fill() {
        System.out.println("Red.fill");
    }
}
