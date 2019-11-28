package com.pattern.domain.proxy.service.impl;

import com.pattern.domain.proxy.service.Image;

import java.util.concurrent.TimeUnit;

/**
 * 真正执行加载图片的类
 */
public class RealImage implements Image {

    private String imageName;

    public RealImage(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void loadImage() {
        System.out.println("名称为"+imageName+"的图片正在加载中...");

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("名称为"+imageName+"的图片加载完成...");
    }
}
