package OOP.AbstractClass;

public abstract class Pet {
    protected String name;
    protected int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void say();
}

class Cat extends Pet {
    public Cat(String name, int age) {
        super(name, age);
        //TODO Auto-generated constructor stub
    }

  

    @Override
    public void say() {
        System.out.println("Meow");
    }
}


class Test {
    public static void main(String[] args) {
        // Pet pet = new Pet("Dog", 1); // this throws a compile time error because Pet is an abstract class and cannot be instantiated

        Pet cat = new Cat("Tom", 1); // it's ok because reference type is Pet, but the actual object is Cat

        cat.say();
    }
}
