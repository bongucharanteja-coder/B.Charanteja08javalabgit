class Print {

    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(double a) {
        System.out.println("Double: " + a);
    }

    void display(String a) {
        System.out.println("String: " + a);
    }
	void display(boolean a) {
		System.out.println("boolean: " + a);
	}

}

public class mol2 {
    public static void main(String[] args) {

        Print p = new Print();

        p.display(10);
        p.display(10.5);
        p.display("Hello");
		p.display(true);
    }
}