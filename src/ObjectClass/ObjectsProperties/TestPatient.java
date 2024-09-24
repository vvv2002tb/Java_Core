package ObjectClass.ObjectsProperties;

public class TestPatient {
    public static void main(String[] args) {
        // Từ khóa new tạo một đối tượng của một lớp cụ thể.
        Patient patient = new Patient(); 
        patient.name = "John";
        patient.age = 20;

        System.out.println(patient.name + " " + patient.age);

        Patient patient2 = patient; // 
        System.out.println(patient2.name + " " + patient2.age);
       
        /*Điều quan trọng là phải hiểu rằng hai biến tham chiếu đến cùng một dữ liệu trong bộ nhớ chứ không phải hai bản sao độc lập. Vì lớp của chúng tôi có thể thay đổi nên chúng tôi có thể sửa đổi đối tượng bằng cả hai tham chiếu. */

        patient2.name = "Doan"; // sửa đổi đối tượng bằng cả hai tham chiếu. 
        System.out.println(patient.name + " " + patient.age); // Lúc này patient đã thay đổi do cả hai tham chiếu đến cùng một đối tượng trong bộ nhớ. (Heap)


    }
}
