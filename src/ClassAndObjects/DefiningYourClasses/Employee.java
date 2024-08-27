package ClassAndObjects.DefiningYourClasses;

import java.time.LocalDate;

public class Employee {
    private static int nextId = 1;
    private int id;
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        setId();
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    // a method
    public String getName() {
        return name;
    }

    // more method
    public void raiseSalary(int percent) {
        if (percent <= 100 && percent >= 0) {
            double raise = salary * percent / 100;
            salary += raise;
        }
        System.out.println(this.salary);
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    /*
    Use static methods in two situations:
    - Khi một phương thức không cần truy cập trạng thái đối tượng vì tất cả đều cần thiết
    các tham số được cung cấp dưới dạng tham số rõ ràng (ví dụ: Math.pow).
    - Khi một phương thức chỉ cần truy cập vào các trường tĩnh của lớp.
     */

    public static void staticMethod() {
        nextId = 1; // correct, sử dụng được với các fields static
        System.out.println(nextId);
//        name = "Vinh"; // false
    }

    public static void tripleSalary(Employee x) {
        x.raiseSalary(200);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
