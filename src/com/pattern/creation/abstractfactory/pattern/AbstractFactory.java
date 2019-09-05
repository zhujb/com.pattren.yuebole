package com.pattern.creation.abstractfactory.pattern;

import com.pattern.creation.abstractfactory.colorService.IColorService;
import com.pattern.creation.abstractfactory.shapeService.IShapeServce;

/**
 * 为 Color 和 Shape 对象创建抽象类来获取工厂。
 */
public abstract class AbstractFactory {
    public abstract IShapeServce getShapeServce(String shape);
    public abstract IColorService getColorService(String color);
}
