public class ReportCard {

  public static void main(String[] args) {
    int finalGrade = 7;
    if (finalGrade < 6) {
      System.out.println("Failed");
    } else if (finalGrade == 6) {
      System.out.println("Final Exam");
    } else {
      System.out.println("Passed");
    }
  }
}