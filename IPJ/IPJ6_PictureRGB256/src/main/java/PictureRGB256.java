import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.io.IOException;

public class PictureRGB256 {
    final int width = 256;
    final int height = 256;
    final String error = "error!!!";
    final String fileFormat = "jpg";
    final String pathName = "//home//lukasz//Pulpit//matrixToFile256pxl.jpg";

    public void makePicture256pxl(int[] RGB) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        int colorFromRGB = convertRGBtoColor(RGB);
        createMatrixOfPixels(image, colorFromRGB);
        createPicture(image);
    }

    private int convertRGBtoColor(int[] RGB) {
        return (RGB[0]<<16) | (RGB[1]<<8) | RGB[2];
    }

    private void createMatrixOfPixels(BufferedImage image, int colorFromRGB){
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                image.setRGB(i, j, colorFromRGB);
            }
        }
    }

    private void createPicture(BufferedImage image){
        try {
            File outputPicture = new File(pathName);
            ImageIO.write(image, fileFormat, outputPicture);
        } catch (IOException e) {
            System.out.println(error);
        }
    }
}