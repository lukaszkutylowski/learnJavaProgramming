/*
Exercise 1.2.2 from book "Introduction to Programming in Java", page 39
*/

public class ExerciseIPJ1 {

    public static void main(String[] args) {

        double theta = Double.parseDouble(args[0]);
        double zeroPointNineInf = 0.9999999999999999;
        double powerSin = Math.pow(Math.sin(theta),2.0);
        double powerCos = Math.pow(Math.cos(theta),2.0);

        if (((powerSin + powerCos) == 1) || ((powerSin + powerCos) == zeroPointNineInf)) {
            System.out.println("true");
        }

    }
}
