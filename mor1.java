class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    @override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class mor1 {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
    }
}