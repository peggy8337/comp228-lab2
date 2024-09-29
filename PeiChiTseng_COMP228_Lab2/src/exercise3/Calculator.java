package exercise3;

public class Calculator {
    public static int calculate(int a, int b) {
        return a + b;
    }

    public static double calculate(double a, double b) {
        return a * b;
    }

    public static int calculate(String operation, int a, int b) {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            default:
                throw new IllegalArgumentException("Invalid operation. Use 'add' or 'subtract'.");
        }

    }
}
