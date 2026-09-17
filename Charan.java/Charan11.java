import java.util.Scanner;
public class Charan11{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("enter your grade(P or F) ");
	char ch=sc.next().charAt(0);
	if(ch == 'P')
		System.out.println("you are promoted ");
	else
		System.out.println("Be prepared for supply exam");
	sc.close();
	}
}
		