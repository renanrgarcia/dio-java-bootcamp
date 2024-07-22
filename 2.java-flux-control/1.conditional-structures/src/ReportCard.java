public class ReportCard {
  public static void main(String[] args) {
    int grade = 90;
    // if (grade >= 60) {
    // System.out.println("Passed");
    // } else if (grade >= 40 && grade < 60) {
    // System.out.println("Remedial");
    // } else {
    // System.out.println("Failed");
    // }

    String result = grade >= 60 ? "Passed" : grade < 60 && grade >= 40 ? "Remedial" : "Failed";
    System.out.println(result);

  }
}
