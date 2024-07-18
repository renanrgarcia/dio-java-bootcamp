public class MyClass {
  public static void main(String[] args) {
    // System.out.println("Hello, my World!");

    // String BR = "Brasil";

    String name = "Renan";
    String lastName = "Garcia";
    String completeName = completeName(name, lastName);
    System.out.println(completeName);

  }

  public static String completeName (String name, String lastName) {
    return "Hello, my name is " + name.concat(" ").concat(lastName);
  }
}
