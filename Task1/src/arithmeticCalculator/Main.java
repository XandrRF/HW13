package arithmeticCalculator;

public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator calculator = new ArithmeticCalculator(15, 30);

        calculator.calculate(Operation.ADD);
        calculator.calculate(Operation.MULTIPLY);
        calculator.calculate(Operation.SUBTRACT);

    }
}