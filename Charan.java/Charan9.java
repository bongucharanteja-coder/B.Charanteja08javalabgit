import java.util.Scanner;
public class Charan9{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("enter how many numbers to be printed ");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
		System.out.println(i);
	sc.close();
}
}