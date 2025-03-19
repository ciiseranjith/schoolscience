import java.util.Random;

public class RandomNumberGenerator {
  private static final Random RANDOM = new Random();
  
  public static int generate() {
    return RANDOM.nextInt(10) + 1;
  }
}

