package base;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 图像IO类
 */
public class BitmapUtils {
    /**
     * 从磁盘读取图片至内存
     *
     * @param imagePath 图片路径
     * @return
     * @throws IOException
     */
    public static BufferedImage readImage(String imagePath) throws IOException {
        File imageFile = new File(imagePath);
        if (!imageFile.exists()) {
            throw new FileNotFoundException("File " + imagePath + "is not exist");
        }
        BufferedImage image = ImageIO.read(imageFile);
        return image;
    }

    /**
     * 将图片从内存写入磁盘
     *
     * @param dir        输出目录
     * @param fileName   输出文件名
     * @param formatName 格式名
     * @param image      图像
     */
    public static void writeImage(String dir, String fileName, String formatName, BufferedImage image) throws IOException {
        File outputDir = new File(dir);
        if (!outputDir.exists()) {
            outputDir.mkdirs();
        }

        File outputFile = new File(outputDir.getPath() + File.separator + fileName);
        ImageIO.write(image, formatName, outputFile);
    }

}
