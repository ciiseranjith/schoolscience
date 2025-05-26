import java.util.Scanner;

public class SchoolsScienceProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Example of an educational scenario question generator
        System.out.println("Please enter a number between 1 and 5:");
        int num = scanner.nextInt();
        
        if (num == 1) {
            System.out.println("The world's largest animal is the blue whale.");
        } else if (num == 2) {
            System.out.println("Do you know the name of this popular dish? ");
        } else if (num == 3) {
            System.out.println("What is the symbol used to represent China?");
        } else if (num == 4) {
            System.out.println("What does 'hello world' mean in English?");
        } else {
            System.out.println("Invalid input. Please try again.");
        }

        scanner.close();
    }
}
