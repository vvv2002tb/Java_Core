package ErrorCode.ExceptionHandling;

import java.util.Scanner;

public class ArithmeticException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // System.out.println(num1 / num2); // an exception is possible here!
        if (num2 == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            System.out.println(num1 / num2);
        }
        System.out.println("finished");
    }
}
