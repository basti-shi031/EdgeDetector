import Impl.AveGrayConverterImpl;
import Impl.MaxGrayConverterImpl;
import Impl.MinGrayConverterImpl;
import Impl.RightGrayConverterImpl;
import base.BitmapUtils;
import converter.GrayConverter;
import mInterface.IBinaryConverter;
import mInterface.IGrayConverter;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class EdgeDetector {
    private IBinaryConverter iBinaryConverter;

    public EdgeDetector() {
    }

    /**
     * 图片文件转化至灰度图
     *
     * @param imageFile      图片文件路径
     * @param iGrayConverter 灰度图转换器
     * @return
     * @throws IOException
     */
    public BufferedImage file2GrayImage(String imageFile, IGrayConverter iGrayConverter) throws IOException {
        GrayConverter grayConverter = new GrayConverter(iGrayConverter);
        BufferedImage grayImage = grayConverter.convert2GrayImage(imageFile);
        return grayImage;
    }

    public static void main(String[] args) throws IOException {
        EdgeDetector detector = new EdgeDetector();
        BufferedImage minGrayImage = detector.file2GrayImage("raw.jpg", new MinGrayConverterImpl());
        BitmapUtils.writeImage(System.getProperty("user.dir"), "gray_min.jpg", "jpg", minGrayImage);

        BufferedImage aveGrayImage = detector.file2GrayImage("raw.jpg", new AveGrayConverterImpl());
        BitmapUtils.writeImage(System.getProperty("user.dir"), "gray_ave.jpg", "jpg", aveGrayImage);

        BufferedImage maxGrayImage = detector.file2GrayImage("raw.jpg", new MaxGrayConverterImpl());
        BitmapUtils.writeImage(System.getProperty("user.dir"), "gray_max.jpg", "jpg", maxGrayImage);

        BufferedImage rightGrayImage = detector.file2GrayImage("raw.jpg", new RightGrayConverterImpl());
        BitmapUtils.writeImage(System.getProperty("user.dir"), "gray_right.jpg", "jpg", rightGrayImage);
    }


}
