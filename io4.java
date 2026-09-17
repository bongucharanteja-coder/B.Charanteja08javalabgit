import java.util.Scanner ;
 public class io4 {
	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		  System.out.println("Enter no of rows ");
		  int a = sc.nextInt();
		  
		   System.out.println("Enter no of coloums ");
		  int b = sc.nextInt();
		  
		  int ar[][] = new int[a][b] ;
		  int arr[][] = new int[a][b] ;

		  System.out.println("Enter Matrix 1 Elements ");
		  
		 for(int i=0;i<a;i++){
			 
			 for(int j=0;j<b;j++){
				
			 ar[i][j] = sc.nextInt();
		 }
	}
	
	    System.out.println("Enter Matrix 2 Elements ");
		
	for(int i=0;i<a;i++){
			 
			 for(int j=0;j<b;j++){
				
			 arr[i][j] = sc.nextInt();
		 }
	}
		 
		 for(int i=0;i<a;i++){
			 
			 for(int j=0;j<b;j++){
				 
			 System.out.print((ar[i][j] + arr[i][j]) + " ");
		 }
		 System.out.println();
	}
		 
		 sc.close();
	 }
 }
		