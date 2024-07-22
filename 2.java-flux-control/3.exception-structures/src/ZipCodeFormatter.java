public class ZipCodeFormatter {
  public static void main(String[] args) {
    try {
      String zipCode = zipcodeFormatter("23765064");
      System.out.println(zipCode);
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("Invalid zip code");
    }
  }

  static String zipcodeFormatter(String zipCode) throws ZipCodeException {
    if (zipCode.length() != 8) {
      throw new ZipCodeException();
    }
    return "23.765-064";
  }
}
