
class Employee {

    private int id;
    private String name;
    private double salary;

    void setId(int id) {
        this.id = id;
    }

    int getId() {
        return id;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    double getSalary() {
        return salary;
    }
}

public class Enc3 {
    public static void main(String[] args) {

        Employee e = new Employee();

        e.setId(101);
        e.setName("Rahul");
        e.setSalary(45000);

        System.out.println("ID: " + e.getId());
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
    }
}
