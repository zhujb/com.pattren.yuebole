package com.pattern.creation.abstractfactory.pattern.impl;

import com.pattern.creation.abstractfactory.colorService.IColorService;
import com.pattern.creation.abstractfactory.colorService.impl.Green;
import com.pattern.creation.abstractfactory.colorService.impl.Pink;
import com.pattern.creation.abstractfactory.colorService.impl.Red;
import com.pattern.creation.abstractfactory.pattern.AbstractFactory;
import com.pattern.creation.abstractfactory.shapeService.IShapeServce;

/**
 * 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 */
public class AbstractColorFactory extends AbstractFactory {
    @Override
    public IShapeServce getShapeServce(String shape) {
        return null;
    }

    @Override
    public IColorService getColorService(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("PINK")) {
            return new Pink();
        }
        return null;
    }
}
