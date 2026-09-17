import java.util.Scanner;
public class Charan12{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("enter your maths marks ");
	int mathMarks=sc.nextInt();
	System.out.println("enter your phy marks ");
	int phyMarks=sc.nextInt();
	System.out.println("enter your chemistry marks ");
	int chemMarks=sc.nextInt();
	int total = mathMarks+phyMarks+chemMarks;
	double avg= (double) total/3;
	System.out.println("total marks scored = "+ total);
	System.out.printf("average = %.2f",avg);
	 
	 sc.close();
	}
}