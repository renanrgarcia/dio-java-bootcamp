public class Students {
  public static void main(String[] args) {
    String[] students = { "Renan", "Thaís", "Aurora", "Pedro" };

    // for (int i = 0; i < students.length; i++) {
    // System.out.println("The student on index " + i + " is " + students[i]);
    // }

    // Abreviated form:
    for (String student : students) {
      System.out.println(student);
    }
  }
}
