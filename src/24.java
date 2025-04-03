import java.util.Scanner;

public class SchoolScienceProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Welcome, " + name + "!");

        int secretNumber = 13;
        int guessCount = 0;

        do {
            System.out.print("Guess a number between 1 and 20: ");
            int guess = scanner.nextInt();

            if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations, " + name + "! You guessed the number in " + guessCount + " guesses.");
                break;
            }
            guessCount++;
        } while (true);

        scanner.close();
    }
}
