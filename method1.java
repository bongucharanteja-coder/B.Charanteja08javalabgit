interface A {
    int sum(int a,int b);	
}

interface B {
    void diff(int a,int b);
}

class C implements A, B {
    public  int sum(int a ,int b) {
		return a+b;
    }

    public int diff(int a ,int b){
			return a-b;
    }
}

public class method1 {
    public static void main(String[] args) {
        C c = new C();

        System.out.println(c.sum(10,234));
        System.out.println(c.diff(3243.45));
    }
}