package exceptionhandling;

public class Stacktrace {

    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace(); // Corrected method name
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
