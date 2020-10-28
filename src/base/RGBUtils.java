package base;

public class RGBUtils {

    public static int color2Rgb(int a, int r, int g, int b) {
        int newRgb = 0;
        newRgb += a;
        newRgb = newRgb << 8;
        newRgb += r;
        newRgb = newRgb << 8;
        newRgb += g;
        newRgb = newRgb << 8;
        newRgb += b;
        return newRgb;
    }

}
