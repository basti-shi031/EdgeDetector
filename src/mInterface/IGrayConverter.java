package mInterface;

import java.awt.image.BufferedImage;

/**
 * 原图-灰度图转换器接口
 */

public interface IGrayConverter {
    BufferedImage convert2GrayImage(BufferedImage rawImage);
}