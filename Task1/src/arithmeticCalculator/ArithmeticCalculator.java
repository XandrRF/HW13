package arithmeticCalculator;

public class ArithmeticCalculator {
    private double a;
    private double b;

    public ArithmeticCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }


    public void calculate(Operation type) {
        if (type == Operation.ADD){
            System.out.println(a+b);
        } else if (type == Operation.MULTIPLY) {
            System.out.println(a*b);
        } else if (type == Operation.SUBTRACT) {
            System.out.println(a-b);
        } else System.out.println("не верная операция");
    }


}
