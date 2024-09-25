package ReferencingSubclassObject;

import java.util.Date;

public class Person {
    protected String name;
    protected int yearOfBirth;
    protected String address;

    public void setName(String name) {
        this.name = name;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    // public getter and setter for all fields

    
}

class Client extends Person{
    protected String contactNumber;
    protected boolean isVIP;

    // public getter and setter for all fields
}

class Employee extends Person{
    protected Date startDate;
    protected double salary;
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // public getter and setter for all fields
    

}

class Test{
    public static void main(String[] args) {
        Person person = new Person(); 
        Client client = new Client();
        Employee employee = new Employee();

        /* 
         Trong trường hợp này, chúng tôi đã sử dụng các tham chiếu lớp con vì kiểu tham chiếu và đối tượng được tạo giống nhau.
         */

        // Superclass reference
        Person clientReference = new Client();
        Person employeeReference = new Employee();

        // Client client = new Person(); // it's impossible too, not working

        /* Chúng ta có thể sử dụng tham chiếu siêu lớp cho bất kỳ đối tượng lớp con nào dẫn xuất từ ​​nó. Tuy nhiên, chúng ta không thể truy cập các thành viên cụ thể của lớp con thông qua tham chiếu lớp cơ sở. Chúng tôi chỉ có quyền truy cập vào những thành viên của đối tượng được xác định bởi loại tham chiếu. */ 

        
        employeeReference.setName("John"); // Ok 
        employeeReference.setYearOfBirth(1990); // Ok
        //employeeReference.setSalary(10000); // Compile-time error, the base class "doesn't know" about the method












        
        
        
    }
}