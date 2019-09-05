package com.pattern.creation.abstractfactory.colorService.impl;

import com.pattern.creation.abstractfactory.colorService.IColorService;

/**
 * 定义绿色并实现IColorService接口
 */
public class Green implements IColorService {
    @Override
    public void fill() {
        System.out.println("Green.fill");
    }
}
