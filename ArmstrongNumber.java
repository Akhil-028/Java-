import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number, originalNumber, remainder, result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        number = scanner.nextInt();
        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

        scanner.close();
    }
}
