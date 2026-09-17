
import java.util.Scanner;

class Student {

    private String name;
    private int marks;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks");
        }
    }

    int getMarks() {
        return marks;
    }
}

public class IoEnc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        s.setName(name);
        s.setMarks(marks);

        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
    }
}
