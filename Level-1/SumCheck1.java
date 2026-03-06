import java.util.Scanner;

public class SumCheck1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
        } else {

            int forSum = 0;

            for (int i = 1; i <= n; i++) {
                forSum += i;
            }

            int formulaSum = n * (n + 1) / 2;

            System.out.println("Sum using for loop = " + forSum);
            System.out.println("Sum using formula = " + formulaSum);

            if (forSum == formulaSum) {
                System.out.println("Both results are correct.");
            }
        }

        input.close();
    }
}