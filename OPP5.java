class Student {
    int    roll;
    String name;
    double marks;
    Student(int r, String n, double mar) {
        roll  = r;
        name   = n;
        marks = mar;
    }
    void display() {
        System.out.printf("roll: %d | Name: %s | marks: %.2f%n", roll, name, marks);
    }
    static void collegeName() {
        System.out.println("ANITS ");
    }
}
public class OPP5 {
    public static void main(String[] args) {
        Student s1 = new Student(420, "Preetam", 99.99);
        Student s2 = new Student(421, "Preethi", 99.143);
		
        Student.collegeName(); 
        s1.display();
        s2.display();
        
    }
}