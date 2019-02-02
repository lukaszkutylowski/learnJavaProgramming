public class Main {

    public static void main(String[] args) {

        int number = 5;

        Calculator casio = new Casio();
        casio.showNumber(number);

        Calculator daymon = new Daymon();
        daymon.showNumber(number);

        CalculatorUser calculatorUser = new CalculatorUser();
        calculatorUser.useCalculator(daymon);
    }
}
