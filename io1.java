import java.util.Scanner;
public class io1 {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your peru ");
		String name = sc.nextLine();
		
		System.out.println("Enter your number  ");
		int no = sc.nextInt();
		
		System.out.println("mee peru : " + name);
		System.out.println("mee sankya : " + no );
		sc.close();
	}
}