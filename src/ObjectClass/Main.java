package ObjectClass;

/*
 * Lớp Object là lớp cha mặc định của tất cả các lớp trong Java.
 * Nó cung cấp các phương thức để làm việc với các đối tượng.
 * Mọi lớp đều mở rộng lớp này một cách ngầm định, do đó nó là gốc của sự kế thừa trong   các chương trình Java. Lớp này thuộc gói java.lang được nhập theo mặc định.
 */

public class Main {
    public static void main(String[] args) {
        // Khởi tạo lớp Object
        Object object = new Object();

        Long number = 1_000_000L; // an instance of Long can be cast to Object
        Object obj1 = number;

        String str = "Hello";
        Object obj2 = str;


        System.out.println(obj1.getClass().getName());
        System.out.println(obj2.getClass().getName());


    }


    // Các phương thức của lớp Object
    // 1. equals() - phương thức này so sánh hai đối tượng
    // 2. hashCode() - phương thức này trả về một số nguyên đại diện cho đối tượng
    // 3. toString() - phương thức này trả về một chuỗi mô tả về đối tượng
    // 4. clone() - phương thức này trả về một bản sao của đối tượng
    // 5. getClass() - phương thức này trả về lớp của đối tượng
    // 6. notify() - chưa học
    // 7. notifyAll() - chưa học
    // 8. wait() - chưa học
    // 9. finalize() - chưa học
    
}
