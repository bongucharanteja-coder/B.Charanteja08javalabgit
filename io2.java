import java.util.Scanner;
 public class io2 {
	 public static void main ( String [] args ) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter first number ");
		 int a = sc.nextInt();
		 
		 System.out.println("Enter second number ");
		 int b = sc.nextInt();
		 
		System.out.println(" sum = " + (a+b) );
		System.out.println(" difference = " + (a-b));
		System.out.println(" product = " + (a*b));
		System.out.println(" quotient = " + (a/b) );
		
		sc.close();
	 }
 }
		 