package Impl;

import base.RGBUtils;
import mInterface.IGrayConverter;

import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * 最小值灰度图转化算法
 */
public class MinGrayConverterImpl implements IGrayConverter {
    @Override
    public int convert2Gray(int r, int g, int b) {
        int min = Math.min(r, Math.min(g, b));
        return min;
    }
}
