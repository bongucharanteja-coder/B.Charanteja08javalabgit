class A {
	int a=10;
	int b=20;
	
}
class B extends A {
	int a=30;
	int b=40;
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
}
    class OPP2 {
		public static void main(String[] args){
     B x = new B();
     x.display();
	}	 
	}