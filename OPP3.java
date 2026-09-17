class A {
	int a=10;
	int b=20;
	
}
class B extends A {
	int a=30;
	int b=40;
	void display(int a,int b)
	{
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("this variable ");
		System.out.println(this.a);
		System.out.println(this.b);
		
		System.out.println("super variable ");
		System.out.println(super.a);
		System.out.println(super.b);
	}
}
    class OPP3 {
		public static void main(String[] args){
     B x = new B();
     x.display(50,60);
	}	 
	}