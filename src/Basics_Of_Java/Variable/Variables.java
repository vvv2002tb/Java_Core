package Basics_Of_Java.Variable;

/** Biến là nơi chứa dữ liệu lưu các giá trị dữ liệu trong quá trình thực thi chương trình Java.
 *  Mỗi Biến trong Java được gán một kiểu dữ liệu chỉ định loại và số lượng giá trị mà nó có thể chứa.
 *  Biến là tên vị trí bộ nhớ cho dữ liệu. */
public class Variables {
    public static String geek = "Shubham Jain";
    public static void main(String[] args) {
        // data _type variable_name = value;
        int a = 10;

        //Local Variable
        int x = 3;

        //Static Variables
        System.out.println(Variables.geek);// có thể truy cập ngoài object

    }

    public class Person {
        //Instance Variables ( biến thể hiện ) Trong 1 class
         public String name;
         public int age;
    }


}
