interface A {
    void showA();
}

interface B {
    void showB();
}

class C implements A, B {
     void showA() {
        System.out.println("A");
    }
     void showB() {
        System.out.println("B");
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();

        obj.showA();
        obj.showB();
    }
}