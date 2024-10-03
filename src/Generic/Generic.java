package Generic;

import ObjectClass.StaticMembers.FinalField;

/*
 * Generic cho phép bạn tạo ra các lớp, giao diện, và phương thức có thể làm việc với bất kỳ kiểu dữ liệu nào mà không bị giới hạn bởi một kiểu cụ thể. Cụ thể, generic giúp bạn viết mã trừu tượng hóa trên các kiểu dữ liệu và tránh sự lặp lại không cần thiết trong mã nguồn.
 */

public class Generic {
    public static void main(String[] args) {
        Box<Integer> box = new Box<Integer>();
        box.set(10);
        System.out.println(box.get());

        Box<String> box2 = new Box<>();
        box2.set("Hello");
        System.out.println(box2.get());


        var stringArray = new ImmutableArray<String>(new String[] { "a", "b", "c" });
        stringArray.printArray();

        var doubleArray = new ImmutableArray<Double>(new Double[] { 1.1, 2.2, 3.3 });
        doubleArray.printArray();

        // Generic with bound
        Box2<Integer> box3 = new Box2<>();
        // box3.setValue("haha"); // error because of bound
        box3.setValue(10);
        Box2.print(box3.getValue());
    }

}

// example
/*
 * T là một kiểu dữ liệu không xác định
 * Có thể có 1 hoặc nhiều kiểu dữ liệu không xác định
 * Quy tắc đặt tên cho tham số không xác định là T, U, V, ...
 * Trong đó T là Type, S, U, V etc. – 2nd, 3rd, 4th types,
 * E – Element (used extensively by different collections)
 * K – Key
 * V – Value
 * N – Number
 */

class Box<T> {
    private T value;

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }

}

// Custom Generic array
class ImmutableArray<T> {
    private final T[] items;

    public ImmutableArray(T[] items) {
        this.items = items.clone();
    }

    public T get(int index) {
        return items[index];
    }

    public int length() {
        return items.length;
    }

    public void printArray() {
        for (T item : items) {
            System.out.println(item);
        }
    }

}

// Generic with bound
// method in generic class
class Box2<T extends Number> {
    private T value;

    public static <T extends Number> void print(T value) {
        System.out.println(value);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
