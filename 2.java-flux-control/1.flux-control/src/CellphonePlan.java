public class CellphonePlan {
  public static void main(String[] args) {
    String plan = "M";

    // Break is not needed
    switch (plan) {
      case "T": {
        System.out.println("5 Gb Youtube");
      }
      case "M": {
        System.out.println("Free Instagram and Whatsapp");
      }
      case "B": {
        System.out.println("100 minutes for calls");
      }
    }
  }
}
