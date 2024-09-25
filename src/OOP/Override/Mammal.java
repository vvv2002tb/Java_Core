package OOP.Override;

/**
 * @Mammal: Siêu lớp động vật có vú
 */
public class Mammal {
    
    public String sayHello() {
        return "ohllalalalalaa";
    }
}


class Cat extends Mammal {
    @Override
    public String sayHello() {
        return "Meow";
    }
}

class Human extends Mammal {
    @Override
    public String sayHello() {
        return "Hello";
    }
}

class Test {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        Cat cat = new Cat();
        Human human = new Human();

        System.out.println(mammal.sayHello()); // print "ohllalalalalaa"

        System.out.println(cat.sayHello()); // print "Meow"

        System.out.println(human.sayHello()); // print "Hello"
    }
}
