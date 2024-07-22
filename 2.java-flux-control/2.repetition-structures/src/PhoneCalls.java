import java.util.Random;

public class PhoneCalls {
  public static void main(String[] args) {
    System.out.println("Dialing...");

    do {
      System.out.println("Cellphone ringing");
    } while (ringing());

    System.out.println("Hello!");
  }

  private static boolean ringing() {
    boolean answer = new Random().nextInt(3) == 1;
    System.out.println("Answered? " + answer);
    return !answer;
  }
}