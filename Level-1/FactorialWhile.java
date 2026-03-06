import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers.");
        } 
        else {

            int i = 1;
            long fact = 1;

            while (i <= n) {
                fact = fact * i;
                i++;
            }

            System.out.println("Factorial of " + n + " is " + fact);
        }

        input.close();
    }
}