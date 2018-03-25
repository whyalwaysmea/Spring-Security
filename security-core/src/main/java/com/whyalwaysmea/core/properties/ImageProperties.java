package com.whyalwaysmea.core.properties;

/**
 * @Author: HanLong
 * @Date: Create in 2018/3/21 22:07
 * @Description:
 */
public class ImageProperties extends SmsCodeProperties{

    public ImageProperties() {setLength(4);}

    private int width = 60;

    private int height = 40;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
