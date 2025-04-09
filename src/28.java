import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Please enter the second number:");
        int num2 = scanner.nextInt();

        if (num1 > 0 && num2 > 0) {
            if (num1 % num2 == 0) {
                System.out.println(num1 + " is divisible by " + num2);
            } else {
                System.out.println(num1 + " is not divisible by " + num2);
            }
        } else {
            System.out.println("The numbers are not positive.");
        }

        scanner.close();
    }
}
