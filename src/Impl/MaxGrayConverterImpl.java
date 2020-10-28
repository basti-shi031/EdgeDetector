package Impl;

import mInterface.IGrayConverter;

/**
 * 最大值灰度图转化算法
 */
public class MaxGrayConverterImpl implements IGrayConverter {
    @Override
    public int convert2Gray(int r, int g, int b) {
        int max = Math.max(r, Math.max(g, b));
        return max;
    }
}
