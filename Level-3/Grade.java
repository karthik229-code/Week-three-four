import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int physics = input.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = input.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = input.nextInt();

        double average = (physics + chemistry + maths) / 3.0;

        System.out.println("Average Marks: " + average);

        if (average >= 80) {
            System.out.println("Grade: A");
        }
        else if (average >= 70) {
            System.out.println("Grade: B");
        }
        else if (average >= 60) {
            System.out.println("Grade: C");
        }
        else if (average >= 50) {
            System.out.println("Grade: D");
        }
        else if (average >= 40) {
            System.out.println("Grade: E");
        }
        else {
            System.out.println("Grade: R");
        }

        input.close();
    }
}