import java.util.Scanner;

public class SumCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
        } else {

            int i = 1;
            int whileSum = 0;

            while (i <= n) {
                whileSum += i;
                i++;
            }

            int formulaSum = n * (n + 1) / 2;

            System.out.println("Sum using while loop = " + whileSum);
            System.out.println("Sum using formula = " + formulaSum);

            if (whileSum == formulaSum) {
                System.out.println("Both results are correct.");
            }
        }

        input.close();
    }
}