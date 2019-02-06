/*
Program from book Introduction to Programming in Java, page 328.
This program show a basic operations manipulating color parameters.
 */

import java.awt.Color;

public class Luminance {

    public static double luminance(Color color) {
        // Compute luminance of color

        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();

        return 0.299*r + 0.587*g + 0.114*b;
    }

    public static Color toGray(Color color) {
        // Use luminance to convert to grayscale

        int y = (int) Math.round(luminance(color));
        Color gray = new Color(y, y, y);

        return gray;
    }

    public static boolean compatible(Color a, Color b) {
        // Print true if colors are compatible, false otherwise
        return Math.abs(luminance(a) - luminance(b)) >= 128;
    }

    public static void main(String[] args) {
        // Are two given RGB colors compatible?

        int[] a = new int[6];

        for (int i = 0; i < 6; i++) {
            a[i] = Integer.parseInt(args[i]);
        }

        Color c1 = new Color(a[0], a[1], a[2]);
        Color c2 = new Color(a[3], a[4], a[5]);

        System.out.println(compatible(c1, c2));

        // Luminace
        System.out.println(luminance(c1));

        // Grayscale
        System.out.println(toGray(c1));
    }
}
