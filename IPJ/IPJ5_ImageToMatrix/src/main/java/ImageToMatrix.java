import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageToMatrix {

    public void imageToMatrix() throws IOException {
        int matrix[] = new int[16384];

        //read image
        File f=new File("//home//lukasz//Pulpit//128colors.jpg");
        BufferedImage img=ImageIO.read(f);

        //get image width and heigth
        int width = img.getWidth();
        int heigth = img.getHeight();

        //convert to matrix
        int i = 0;
        for(int y = 0; y < heigth; y++) {
            for(int x = 0; x< width; x++) {
                matrix[i] = img.getRGB(x,y);
                i++;
            }
        }

        //check example pixels
        for(int j = 0; j < 5; j++) {
            System.out.println("Pixel " + j + " of matrix: " + matrix[j]);
        }

        //convert hex -> dec
        int blue = matrix[0] & 0xff;
        int green = (matrix[0] & 0xff00) >> 8;
        int red = (matrix[0] & 0xff0000) >> 16;

        //check example RBG
        System.out.println("RGB of pixel no. 0:");
        System.out.println("R: " + red + ", G: " + green + ", B: " + blue);
    }
}