import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Process {

    public int[] convertImageToMatrix(String path) throws IOException {
        int matrix[] = new int[786432];

        //read image
        File f = new File(path);
        BufferedImage img = ImageIO.read(f);

        //get image width and heigth
        int width = img.getWidth();
        int heigth = img.getHeight();

        //convert to matrix
        int i = 0;
        for (int y = 0; y < heigth; y++) {
            for (int x = 0; x < width; x++) {
                matrix[i] = img.getRGB(x, y);
                i++;
            }
        }

        return matrix;
    }

    public int[] toGrayScale(int[] matrix, String newPath, int width, int height, String fileFormat) throws IOException {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        int blue, green, red, average;

        for (int j = 0; j < matrix.length; j++) {
            blue = matrix[j] & 0xff;
            green = (matrix[j] & 0xff00) >> 8;
            red = (matrix[j] & 0xff0000) >> 16;

            average = (blue + green + red) / 3;

            matrix[j] = (average<<16) | (average<<8) | average;
        }

        int z = 0;

        for(int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                image.setRGB(x, y, matrix[z]);
                z++;
            }
        }

        //show all RBG pixels
        for (int j = 350000; j < 350100; j++) {
            System.out.println(matrix[j]);
        }

        File outputPicture = new File(newPath);
        ImageIO.write(image, fileFormat, outputPicture);

        return matrix;
    }

    public void thresholding(int[] grayMatrix, String newPath, int width, int height, String fileFormat, int threshold) throws IOException {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        int blue, green, red, average;

        for (int j = 0; j < grayMatrix.length; j++) {
            blue = grayMatrix[j] & 0xff;
            green = (grayMatrix[j] & 0xff00) >> 8;
            red = (grayMatrix[j] & 0xff0000) >> 16;

            average = (blue + green + red) / 3;

            if (average < threshold) {
                average = 0;
            } else {
                average = 255;
            }

            grayMatrix[j] = (average<<16) | (average<<8) | average;
        }

        int z = 0;

        for(int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                image.setRGB(x, y, grayMatrix[z]);
                z++;
            }
        }

        //show all RBG pixels
        for (int j = 350000; j < 350100; j++) {
            System.out.println(grayMatrix[j]);
        }

        File outputPicture = new File(newPath);
        ImageIO.write(image, fileFormat, outputPicture);
    }
}
