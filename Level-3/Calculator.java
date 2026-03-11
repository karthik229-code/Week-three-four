import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = input.next().charAt(0);

        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        switch(op) {

            case '+':
                System.out.println("Result: " + (first + second));
                break;

            case '-':
                System.out.println("Result: " + (first - second));
                break;

            case '*':
                System.out.println("Result: " + (first * second));
                break;

            case '/':
                System.out.println("Result: " + (first / second));
                break;

            default:
                System.out.println("Invalid Operator");
        }

        input.close();
    }
}