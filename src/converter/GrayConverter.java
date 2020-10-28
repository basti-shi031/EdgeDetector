package converter;

import base.BitmapUtils;
import base.RGBUtils;
import mInterface.IGrayConverter;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class GrayConverter {
    private IGrayConverter iGrayConverter;

    public GrayConverter(IGrayConverter iGrayConverter) {
        this.iGrayConverter = iGrayConverter;
    }

    public BufferedImage convert2GrayImage(String filePath) throws IOException {

        BufferedImage rawImage = BitmapUtils.readImage(filePath);
        int width = rawImage.getWidth();
        int height = rawImage.getHeight();

        if (width <= 0 || height <= 0) {
            throw new IOException("This image is empty");
        }

        BufferedImage grayImage = new BufferedImage(width, height, rawImage.getType());

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int rgb = rawImage.getRGB(i, j);
                int r = (rgb >> 16) & 0xff;
                int g = (rgb >> 8) & 0xff;
                int b = rgb & 0xff;
                int newRgb = iGrayConverter.convert2Gray(r, g, b);
                int grayRgb = RGBUtils.color2Rgb(0, newRgb, newRgb, newRgb);
                grayImage.setRGB(i, j, grayRgb);
            }
        }
        return grayImage;

    }
}
