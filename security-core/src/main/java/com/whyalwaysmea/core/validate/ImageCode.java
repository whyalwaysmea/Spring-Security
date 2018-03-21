package com.whyalwaysmea.core.validate;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

/**
 * @Author: HanLong
 * @Date: Create in 2018/3/19 21:09
 * @Description:
 */
public class ImageCode {

    private BufferedImage image;

    private String code;

    private LocalDateTime expireTime;

    public ImageCode(BufferedImage image, String code, int expireId) {
        this.image = image;
        this.code = code;
        this.expireTime = LocalDateTime.now().plusSeconds(expireId);
    }

    public ImageCode(BufferedImage image, String code, LocalDateTime localDateTime) {
        this.image = image;
        this.code = code;
        this.expireTime = localDateTime;
    }

    /**
     * 是否过期
     * @return
     */
    public boolean isExpried() {
        return LocalDateTime.now().isAfter(expireTime);
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDateTime getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(LocalDateTime expireTime) {
        this.expireTime = expireTime;
    }
}
