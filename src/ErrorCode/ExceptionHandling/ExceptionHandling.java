package ErrorCode.ExceptionHandling;

/* 
    May mắn thay, có thể viết một số mã để xử lý ngoại lệ mà không dừng toàn bộ chương trình. Để làm được điều đó, Java cung cấp một cơ chế xử lý ngoại lệ hoạt động với cả ngoại lệ được kiểm tra và không được kiểm tra.

 */

public class ExceptionHandling {
    public static void main(String[] args) {
        // try catch statement
        /*
         try {
          // code that might throw an exception
          } catch (Exception e) {
          // code that handles the exception
          }
         */

        System.out.println("before the try-catch block"); // it will be printed

        try {
            System.out.println("inside the try block before an exception"); // it will be printed

            System.out.println(2 / 0); // it throws ArithmeticException

            System.out.println("inside the try block after the exception"); // it won't be printed
        } catch (Exception e) { // IOException, ArithmeticException, ...
            System.out.println("Division by zero!"); // it will be printed
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally block");
        }

        System.out.println("after the try-catch block"); // it will be printed
    }

}
