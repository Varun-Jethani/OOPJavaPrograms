package unit_1;

public class ExceptHandling {

    public static void divide(int a, int b) {
        try {
            int c = a / b;
            System.out.println("Result is " + c);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
        }
        finally {
            System.out.println("Finally block is always executed");
        }
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        divide(90,0);
        try {
            int c = a / b;
            System.out.println("Result is " + c);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
        }
        finally {
            System.out.println("Finally block is always executed");
        }
    }
}
