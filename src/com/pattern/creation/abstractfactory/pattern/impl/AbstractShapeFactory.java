package com.pattern.creation.abstractfactory.pattern.impl;

import com.pattern.creation.abstractfactory.colorService.IColorService;
import com.pattern.creation.abstractfactory.pattern.AbstractFactory;
import com.pattern.creation.abstractfactory.shapeService.IShapeServce;
import com.pattern.creation.abstractfactory.shapeService.impl.Circle;
import com.pattern.creation.abstractfactory.shapeService.impl.Rectangle;
import com.pattern.creation.abstractfactory.shapeService.impl.Square;

/**
 * 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 */
public class AbstractShapeFactory extends AbstractFactory {

    @Override
    public IShapeServce getShapeServce(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    public IColorService getColorService(String color) {
        return null;
    }
}
