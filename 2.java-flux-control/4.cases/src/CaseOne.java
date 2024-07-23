public class CaseOne {
  public static void main(String[] args) {
    analyzeSalary(1500.0);
    analyzeSalary(2000.0);
    analyzeSalary(2500.0);

  }

  public static void analyzeSalary(double salary) {
    Double baseSalary = 2000.0;
    if (salary < baseSalary) {
      System.out.println("Call candidate.");
    } else if (salary == baseSalary) {
      System.out.println("Call candidate with another salary proposal.");
    } else {
      System.out.println("Waiting for other candidates.");
    }
  }
}