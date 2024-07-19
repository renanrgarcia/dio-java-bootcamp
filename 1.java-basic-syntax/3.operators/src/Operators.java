public class Operators {
    public static void main(String[] args) throws Exception {
        boolean condition1 = true;
        boolean condition2 = true;

        if (condition1 && (7>4)) {
            System.out.println("Both conditions are true");
        };

        if (condition1 || condition2) {
            System.out.println("At least one condition is true");
        };
        
        System.out.println("The end");
    
    }
}
