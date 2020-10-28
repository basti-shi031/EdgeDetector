package Impl;

import mInterface.IGrayConverter;

/**
 * 加权灰度图转化算法
 */
public class RightGrayConverterImpl implements IGrayConverter {
    @Override
    public int convert2Gray(int r, int g, int b) {
        int right = (int) (0.3 * r + 0.59 * g + 0.11 * b);//加权法灰度化
        return right;
    }
}
