package ControlFlow;

import java.util.Random;
import java.util.Scanner;

public class SwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter level: ");
        String level = scanner.nextLine();
        try {
            Level level1 = Level.valueOf(level);
            switch (level1) {
                case EASY:
                    System.out.println("Easy level");
                    break;
                case MEDIUM:
                    System.out.println("Medium level");
                    break;
                case HARD:
                    System.out.println("Hard level");
                    break;
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Invalid level");
        }

        // short switch
        Level level2 = Level.EASY;
        switch (level2) {
            case EASY -> System.out.println("Easy level");
            case MEDIUM -> System.out.println("Medium level");
            case HARD -> System.out.println("Hard level");
        }

        // short switch with return
        Level level3 = Level.EASY;
        String result = switch (level3) {
            case EASY -> "Easy level";
            case MEDIUM -> "Medium level";
            case HARD -> "Hard level";
            default -> throw new IllegalStateException("Invalid level");
        };
        System.out.println(result);

        
    }
}

enum Level {
    EASY,
    MEDIUM,
    HARD;
}
