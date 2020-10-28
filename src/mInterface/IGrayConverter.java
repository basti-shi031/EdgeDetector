package mInterface;

import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * 原图-灰度图转换器接口
 */

public interface IGrayConverter {
    int convert2Gray(int r, int g, int b);
}