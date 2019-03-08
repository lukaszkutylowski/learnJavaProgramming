import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.io.IOException;

public class PictureRGB256 {

    public void makePicture256pxl(int[] RGB, int width, int height, String error, String fileFormat, String pathName) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        int colorFromRGB = convertRGBtoColor(RGB);
        createMatrixOfPixels(image, colorFromRGB, width, height);
        createPicture(image, error, fileFormat, pathName);
    }

    private int convertRGBtoColor(int[] RGB) {
        return (RGB[0]<<16) | (RGB[1]<<8) | RGB[2];
    }

    private void createMatrixOfPixels(BufferedImage image, int colorFromRGB, int width, int height){
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                image.setRGB(i, j, colorFromRGB);
            }
        }
    }

    private void createPicture(BufferedImage image, String error, String fileFormat, String pathName){
        try {
            File outputPicture = new File(pathName);
            ImageIO.write(image, fileFormat, outputPicture);
        } catch (IOException e) {
            System.out.println(error);
        }
    }
}