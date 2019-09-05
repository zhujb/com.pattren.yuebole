package com.pattern.creation.abstractfactory.colorService.impl;

import com.pattern.creation.abstractfactory.colorService.IColorService;

/**
 * 定义粉色并实现IColorService接口
 */
public class Pink implements IColorService {
    @Override
    public void fill() {
        System.out.println("Pink.fill");
    }
}
