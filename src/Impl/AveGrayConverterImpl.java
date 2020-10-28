package Impl;

import base.RGBUtils;
import mInterface.IGrayConverter;

import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * 最小值灰度图转化算法
 */
public class AveGrayConverterImpl implements IGrayConverter {
    @Override
    public int convert2Gray(int r, int g, int b) {
        return (r + g + b) / 3;
    }
}
