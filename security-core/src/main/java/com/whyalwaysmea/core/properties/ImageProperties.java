package com.whyalwaysmea.core.properties;

/**
 * @Author: HanLong
 * @Date: Create in 2018/3/21 22:07
 * @Description:
 */
public class ImageProperties {

    private int width = 60;

    private int height = 40;

    private int length = 4;

    private int expireTime = 60;

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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(int expireTime) {
        this.expireTime = expireTime;
    }
}
