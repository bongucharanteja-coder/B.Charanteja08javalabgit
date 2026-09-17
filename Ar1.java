import java.util.Scanner ;
public class Ar1 {
	public static void main (String[] arg){
		String ar[] = new String[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i<= 4 ; i++){
			
			System.out.println("Enter name ");
			ar[i] = sc.nextLine();
		}
		System.out.println(" -----NAMES---- ");
		for(int i = 0 ; i<= 4 ; i++) {
		System.out.println( i + "." + ar[i] );
		}
		
		sc.close();
		
	}
}