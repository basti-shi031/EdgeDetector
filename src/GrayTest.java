import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GrayTest {
    public static void main(String[] args) throws IOException {
        BufferedImage grayImage = convertGrayImage("raw.jpg");
    }

    private static BufferedImage convertGrayImage(String path) throws IOException {

        File file = new File(path);

        if (!file.exists()) {
            throw new FileNotFoundException("this picture is not exists");
        }

        BufferedImage image = ImageIO.read(file);
        int width = image.getWidth();
        int height = image.getHeight();

        BufferedImage grayImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_BINARY);//重点，技巧在这个参数BufferedImage.TYPE_BYTE_BINARY

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int rgb = image.getRGB(i, j);
                grayImage.setRGB(i, j, rgb);
            }
        }

        File newFile = new File("gray.jpg");
        ImageIO.write(grayImage, "jpg", newFile);

        return null;

    }
}
