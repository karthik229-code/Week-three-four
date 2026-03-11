import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int original = number;
        int sum = 0;

        while(number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        if(original % sum == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not a Harshad Number");

        input.close();
    }
}