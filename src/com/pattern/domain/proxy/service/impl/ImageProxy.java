package com.pattern.domain.proxy.service.impl;

import com.pattern.domain.proxy.service.Image;

/**
 * 图片加载的代理类
 */
public class ImageProxy implements Image {

    private Image image;

    private String imageName;

    public ImageProxy(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void loadImage() {
        if (image==null) {
            image=new RealImage(imageName);
        }

        image.loadImage();
    }
}
