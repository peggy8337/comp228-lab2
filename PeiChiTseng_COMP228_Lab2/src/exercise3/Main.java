package exercise3;

public class Main {
    public static void main(String[] args) {
        int sum = Calculator.calculate(10, 20);
        System.out.println("Sum of 10 and 20: " + sum);

        double product = Calculator.calculate(5.5, 4.0);
        System.out.println("Product of 5.5 and 4.0: " + product);

        int resultAdd = Calculator.calculate("add", 15, 5);
        System.out.println("Addition of 15 and 5: " + resultAdd);

        int resultSubtract = Calculator.calculate("subtract", 15, 5);
        System.out.println("Subtraction of 15 and 5: " + resultSubtract);

    }
}
