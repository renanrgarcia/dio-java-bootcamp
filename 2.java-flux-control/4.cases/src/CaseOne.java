import java.util.concurrent.ThreadLocalRandom;

public class CaseOne {
  public static void main(String[] args) {
    // Double baseSalary = 2000.0;
    String[] candidates = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA",
        "JORGE" };

    // selectCandidates(candidates, baseSalary);

    printSelectCandidates(candidates);
  }

  public static void printSelectCandidates(String[] candidates) {
    // for each loop
    for (String candidate : candidates) {
      System.out.println(candidate);
    }

    // for loop
    for (int i = 0; i < candidates.length; i++) {
      System.out.println((i + 1) + ". " + candidates[i]);
    }
  }

  public static void selectCandidates(String[] candidates, Double baseSalary) {
    int currentCandidate = 0;
    int selectedCandidatesCount = 0;
    while (selectedCandidatesCount < 5 && currentCandidate < candidates.length) {
      String candidate = candidates[currentCandidate];
      Double salary = intendedSalary();

      if (salary >= baseSalary) {
        System.out.println(candidate + " - " + salary);
        System.out.println("Selected candidate: " + candidate);
        selectedCandidatesCount++;
      }
      currentCandidate++;
    }
  }

  static double intendedSalary() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }

  public static void analyzeSalary(double salary, Double baseSalary) {
    if (salary < baseSalary) {
      System.out.println("Call candidate.");
    } else if (salary == baseSalary) {
      System.out.println("Call candidate with another salary proposal.");
    } else {
      System.out.println("Waiting for other candidates.");
    }
  }
}