package mInterface;

import java.awt.image.BufferedImage;

/**
 * 灰度图-二值图转化器
 */
public interface IBinaryConverter {
    BufferedImage convert2BinaryImage(BufferedImage grayImage);
}
