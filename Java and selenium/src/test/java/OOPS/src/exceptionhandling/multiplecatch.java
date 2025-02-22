package exceptionhandling;
import java.util.*;

public class multiplecatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = Integer.parseInt(sc.nextLine());  
            
            if (n == 0) {
                throw new ArithmeticException("Cannot divide by zero"); 
            }
            
            if (99 % n == 0)
                System.out.println(n + " is a factor of 99");
            else
                System.out.println(n + " is not a factor of 99");

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println("Number Format Exception: " + ex.getMessage());
        } finally {
            sc.close();          }
    }
}
