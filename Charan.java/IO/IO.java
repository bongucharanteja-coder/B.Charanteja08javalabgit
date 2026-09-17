import java.util.Scanner;
public class IO{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
System.out.println("you entered "+n);
sc.close();
}
}