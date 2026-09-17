import java.util.Scanner;
public class Charan10{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("enter your age ");
	int n=sc.nextInt();
	if(n>=18)
		System.out.println("you can vote ");
	else
		System.out.println("not eligible");
	sc.close();
	}
}
		