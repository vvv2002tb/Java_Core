package ErrorCode.ExceptionHandling;

/* 
 * throw là một câu lệnh được sử dụng để tạo ra một ngoại lệ tùy chỉnh. 
 * Nó được sử dụng để báo lỗi khi một điều kiện cụ thể không được đáp ứng.
 * throw có thể được sử dụng để báo lỗi khi một điều kiện cụ thể không được đáp ứng.
 * Cú pháp: throw new ExceptionType("Error Message");
 * Công dụng của throw: 
 * - Xử lý ngoại lệ thủ công: Khi bạn muốn tự phát hiện một tình huống bất thường và ném ngoại lệ (ví dụ: các giá trị không hợp lệ).
 * - Tạo ra các ngoại lệ tùy chỉnh
 */

public class Throw {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // ví dụ về ngoại lệ tùy chỉnh
        try {
            checkNumber(0);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        } 
        System.out.println("Age is valid.");
    }

    // ví dụ về ngoại lệ tùy chỉnh 
    static void checkNumber(int number) throws CustomException {
        if (number == 0) {
            throw new CustomException("Number cannot be 0.");
        }
        System.out.println("Number is valid.");
    }
    
}


class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

