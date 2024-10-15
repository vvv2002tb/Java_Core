package LambdaExpressions;

// Một functional interface là một interface chỉ có một abstract method.

@FunctionalInterface
public interface Animal {
    void makeSound();
}


class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Test {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.makeSound();

        // lambda expression
        Animal cat2 = () -> System.out.println("Cat2 make sound");
        cat2.makeSound();
    }
}

// with parameter
@FunctionalInterface
interface People {
    void speak(String firstName, String lastName);
}


class Test2 {
    public static void main(String[] args) {
        People vinh = (firstName, lastName) -> System.out.println("Hello, my name is " + firstName + " " + lastName);
        vinh.speak("Vinh", "Doan");
    }
}