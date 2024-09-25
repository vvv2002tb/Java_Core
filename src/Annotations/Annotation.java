package Annotations;

/* Annotation là một công cụ mạnh mẽ để cung cấp thông tin cho trình duyệt, trình biên dịch và các công cụ khác về cách sử dụng của một lớp, phương thức, trường, hoặc đối tượng khác trong mã nguồn. 
 */

public class Annotation {
    public static void main(String[] args) {
        
    }

    // @Override: Đánh dấu phương thức được ghi đè



    // @Deprecated: Cảnh báo người dùng về phương thức đã lỗi thời, Đánh dấu phương thức đã lỗi thời.
    @Deprecated
    public void oldMethod() { 
        System.out.println("This is an old method");
    }

    // @SuppressWarnings: @SuppressWarnings ra lệnh cho trình biên dịch vô hiệu hóa một số cảnh báo trong thời gian biên dịch.

    /* 
     * Hãy tưởng tượng bạn đã tạo một phương thức printHello nhưng không sử dụng nó. Trình biên dịch không thích các phương thức không được sử dụng nhưng với chú thích @SuppressWarnings("unused") trong đó "unused" là một tham số, bạn có thể tắt cảnh báo biên dịch đó. Chú thích này có thể được áp dụng cho các lớp, phương thức, trường, biến cục bộ và các phần khác của chương trình.
     */

     // SuppressWarnings("unused"): Tắt cảnh báo về biến không được sử dụng.
     // SuppressWarnings("deprecation"): Tắt cảnh báo về phương thức đã lỗi thời.

    @SuppressWarnings("unused, deprecation")
    public void printHello() {
        System.out.println("Hello!");
    }



    
}
