package mInterface;

import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * 灰度图-二值图转化器
 */
public interface IBinaryConverter {
    BufferedImage convert2BinaryImage(BufferedImage grayImage);
}
