import java.util.Scanner;

public class CalculatorView {

    private Scanner scanner = new Scanner(System.in);

    public double getFirstNumber() {
        System.out.print("Enter the first number: ");
        return scanner.nextDouble();
    }

    public double getSecondNumber() {
        System.out.print("Enter the second number: ");
        return scanner.nextDouble();
    }

    public String getOperation() {
        System.out.print("Enter the operation (+,-,*,/): ");
        return scanner.next();
    }

    public void showResult(double result) {
        System.out.printf("Result: %.2f%n", result);
    }

    public void showError(String errorMessage) {
        System.out.println("Error: " + errorMessage);
    }
}