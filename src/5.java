import java.util.Random;
public static void main(String[] args) {
	// Generate a random number between 1 and 10
	int num = new Random().nextInt(10) + 1;
	System.out.println("The random number is: " + num);
}