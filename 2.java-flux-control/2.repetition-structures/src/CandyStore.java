
import java.util.concurrent.ThreadLocalRandom; // Simulate a random number

public class CandyStore {
  public static void main(String[] args) {
    double allowance = 50.00;

    while (allowance > 0.00) {
      Double candyPrice = randomValue();

      if (candyPrice > allowance)
        candyPrice = allowance;

      allowance -= candyPrice;
      System.out.println("Candy price: " + candyPrice + ". Allowance: " + allowance + ".");
    }
  }

  private static double randomValue() {
    return ThreadLocalRandom.current().nextDouble(2.00, 15.00);
  }
}
