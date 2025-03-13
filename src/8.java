import java.util.Random;
class RandomNumber {
  public static void main(String[] args) {
    int number = getRandomInt();
    System.out.println("Your random number is: " + number);
  }
  private static int getRandomInt() {
    Random rand = new Random();
    return rand.nextInt(100);
  }
}