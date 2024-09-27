package ErrorCode.ExceptionHandling;

import java.util.Scanner;

/* 
 * NumberFormatException là một loại ngoại lệ (exception) trong Java xảy ra khi bạn cố gắng chuyển đổi một chuỗi (string) thành một số (number) nhưng chuỗi đó không thể được chuyển đổi theo định dạng số hợp lệ. Đây là một phần của Java Runtime Exception và thường xảy ra khi bạn làm việc với các phương thức như Integer.parseInt(), Double.parseDouble(), hoặc các phương thức tương tự khác trong Java.


 */

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        // int number = Integer.parseInt(input); // // an exception is possible here!

        if (input.matches("\\d+")) {
            int number = Integer.parseInt(input);
            System.out.println("Number: " + number);
        } else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}

