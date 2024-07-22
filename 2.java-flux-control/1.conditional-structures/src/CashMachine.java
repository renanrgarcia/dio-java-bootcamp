public class CashMachine {
  public static void main(String[] args) {
    double balance = 100.0;
    double amount = 50.0;

    if (amount < balance)
      balance -= amount;

    System.out.println("New balance: " + balance);
  }
}
