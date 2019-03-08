/*
Write a program that takes three integers between 0 and 255 that represent red, green and blue values of color
and then creates and shows a 256-by-256 Picture of that color.
Modified 3.1.2 from IPJ, page 362
 */

public class Start {
    public static void main(String[] args) {

        int[] RGB = new int[3];
        RGB[0] = 123;
        RGB[1] = 12;
        RGB[2] = 1;

        final int width = 256;
        final int height = 256;
        final String error = "error!!!";
        final String fileFormat = "jpg";
        final String pathName = "//home//lukasz//Pulpit//matrixToFile256pxl.jpg";

        PictureRGB256 pic1 = new PictureRGB256();
        pic1.makePicture256pxl(RGB, width, height, error, fileFormat, pathName);
    }
}
