package ControlFlow;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // if (condition) statement
        /*
            for example
            if (yourSales >= target)
            {
                 performance = "Satisfactory";
                 bonus = 100;
            }
         */
        System.out.println("Number: ");
        int number = scanner.nextInt();
        if (number > 5) {
            System.out.println(number + " is bigger than 5");
        } else {
            System.out.println(number + " is less than 5");
        }
    }
}
