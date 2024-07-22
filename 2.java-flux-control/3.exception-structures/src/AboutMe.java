import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Enter your name: ");
            String name = scanner.next();

            System.out.println("Enter your last name: ");
            String lastName = scanner.next();

            System.out.println("Enter your age: ");
            int age = scanner.nextInt();

            System.out.println("Enter your height: ");
            double height = scanner.nextDouble();

            System.out.println("Hello, my name is " + name + " " + lastName);
            System.out.println("I am " + age + " years old");
            System.out.println("My height is " + height + " meters");

            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Age or height must be a number.");
        }
    }
}
