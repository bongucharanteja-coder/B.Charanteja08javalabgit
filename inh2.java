class Student {
    int    rollNo;
    String Name;
    double cgpa;

    Student() {                        
        rollNo = 0; Name = "Unknown"; cgpa = 0.0;
    }
    Student(int r, String n) {          
        rollNo = r; Name = n; cgpa = 0.0;
    }
    Student(int r, String n, double g) { 
        rollNo = r; Name = n; cgpa = g;
    }
    void show() {
        System.out.printf("%d | %s | %.2f%n", rollNo, Name, cgpa);
    }
}

public class inh2 {
    public static void main(String[] args) {
        new Student().show();
        new Student(420, "preeti").show();
        new Student(100, "Preetam", 0.5).show();
    }
}