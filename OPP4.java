class Student {
	String name;
	int marks;
	char grade;
	void display(){
		System.out.println("Name : "+name);
		System.out.println("marks : "+marks);
		System.out.println("grade : "+grade);
   }
}
   
   class OPP4 {
	   public static void main (String [] args){
		   Student s1 = new Student();
		   s1.name="CHARAN";
		   s1.marks=100;
		   s1.grade='A';
		   
		s1.display();
	   }
   }
