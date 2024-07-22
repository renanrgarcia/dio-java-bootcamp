import java.text.NumberFormat;
import java.text.ParseException;

public class ExceptionExample {
  public static void main(String[] args) {
    // Unchecked exception < You don't have to handle it here
    Number valor = Double.valueOf("a1.75");

    // Checked exception < You have to handle it here
    try {
      valor = NumberFormat.getInstance().parse("a1.75");
    } catch (ParseException e) {
      e.printStackTrace();
    }

    System.out.println(valor);
  }

}
