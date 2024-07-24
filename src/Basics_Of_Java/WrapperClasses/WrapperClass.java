package Basics_Of_Java.WrapperClasses;
/*
 Có một số nhu cầu nhất định khi sử dụng lớp Wrapper trong Java như được đề cập bên dưới:
 - Họ chuyển đổi các kiểu dữ liệu nguyên thủy thành các đối tượng. Các đối tượng
 là cần thiết nếu chúng ta muốn sửa đổi các đối số được truyền vào một phương thức (vì các kiểu nguyên thủy được truyền theo giá trị).
 - Các lớp trong gói java.util chỉ xử lý các đối tượng và do đó các lớp trình bao bọc cũng trợ giúp trong trường hợp này.
 - Cần có một đối tượng để hỗ trợ đồng bộ hóa trong đa luồng.
*/

/*
    Advantages of Wrapper Classes
    - Collections chỉ cho phép dữ liệu đối tượng.
    - Trên dữ liệu đối tượng, chúng ta có thể gọi nhiều phương thức so sánhTo(), bằng(), toString()
    - Dữ liệu đối tượng cho phép giá trị null.

 */
public class WrapperClass {
    public static void main(String[] args) {
        Integer a = 0;
        Double b = 1.0;
        Float c = 1f;
        String s;
        Character l;
        System.out.println(a.compareTo(1));

    }
}
