package OOP.AnonymousClass;

interface SpeakingEntity {
    void sayHello();
    void sayGoodbye();
}

public class AnonymousClass {
    public static void main(String[] args) {
        SpeakingEntity englishSpeakingPerson = new SpeakingEntity() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayGoodbye() {
                System.out.println("Goodbye");
    }
        };

        englishSpeakingPerson.sayHello();
        englishSpeakingPerson.sayGoodbye();
    }
}
