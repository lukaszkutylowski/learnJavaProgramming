/*
Write a program that takes three integers between 0 and 255 that represent red, green and blue values of color
and then creates and shows a 256-by-256 Picture of that color.
Modified 3.1.2 from IPJ, page 362
 */

public class Start {
    public static void main(String[] args) {
        int[] RGB = new int[3];
        RGB[0] = 123;
        RGB[1] = 23;
        RGB[2] = 3;

        PictureRGB256 pic1 = new PictureRGB256();
        pic1.makePicture256pxl(RGB);
    }
}
