public class Operators {
    public static void main(String[] args) throws Exception {
        int number = 5;

        // number = number++;
        System.out.println(number++); // print 5 and increment later

        System.out.println(number);

        boolean variable = true;

        System.out.println(!variable); // just in memory
        System.out.println(variable); // value not changed

        variable = !variable; // value changed

        System.out.println(variable);
    }
}
