
class Student {

    private String name;
    private int age;


    void setName(String name) {
        this.name = name;
    }

 
    String getName() {
        return name;
    }


    void setAge(int age) {
        this.age = age;
    }

 
    int getAge() {
        return age;
    }
}

public class Enc2 {
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Charan");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
