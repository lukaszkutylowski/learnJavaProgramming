import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.io.IOException;

public class PictureRGB {
    private int[] RGB;
    private int width;
    private int height;
    private String errorMessage;
    private String fileFormat;
    private String pathName;

    PictureRGB(int[] apiRGB, int apiWidth, int apiHeight, String apiErrorMessage, String apiFileFormat, String apiPathName) {
        RGB = apiRGB;
        width = apiWidth;
        height = apiHeight;
        String errorMessage = apiErrorMessage;
        String fileFormat = apiFileFormat;
        String pathName = apiPathName;
        makePictureXYZpxl(RGB, width, height, errorMessage, fileFormat, pathName);
    }

    public void makePictureXYZpxl(int[] RGB, int width, int height, String errorMessage, String fileFormat, String pathName) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        int colorFromRGB = convertRGBtoColor(RGB);
        createMatrixOfPixels(image, colorFromRGB, width, height);
        createPicture(image, errorMessage, fileFormat, pathName);
    }

    private int convertRGBtoColor(int[] RGB) {
        return (RGB[0] << 16) | (RGB[1] << 8) | RGB[2];
    }

    private void createMatrixOfPixels(BufferedImage image, int colorFromRGB, int width, int height) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                image.setRGB(i, j, colorFromRGB);
            }
        }
    }

    private void createPicture(BufferedImage image, String errorMessage, String fileFormat, String pathName) {
        try {
            File outputPicture = new File(pathName);
            ImageIO.write(image, fileFormat, outputPicture);
        } catch (IOException e) {
            System.out.println(errorMessage);
        }
    }

    public int[] getRGB() {
        return RGB;
    }

    public int getWidth() { return width; }

    public int getHeight() { return height; }

    public String getErrorMessage() { return errorMessage; }

    public String getFileFormat() { return fileFormat; }

    public String getPathName() { return pathName; }
}