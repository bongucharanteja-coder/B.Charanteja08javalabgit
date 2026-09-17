import java.util.Scanner ;
 public class io3 {
	 public static void main(String[] args) {
		 int ar[] = new int[10] ;
		
		  Scanner sc = new Scanner(System.in);
		 
		 for(int i=0;i<10;i++){
			 System.out.println("Enter number ");
			 ar[i] = sc.nextInt();
		 }
		 
		 for (int i=1;i<10;i++){
			 System.out.print(ar[i] + " ");
		 }
		 
		 sc.close();
	 }
 }
			
			 