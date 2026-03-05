import java.util.Scanner;

public class SumWithInfinity {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = input.nextDouble();

            if (num <= 0) {
                break;
            }

            total += num;
        }

        System.out.println("Total sum = " + total);

        input.close();
    }
}