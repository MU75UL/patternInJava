//HALF PYRAMID
import java.util.Scanner;
public class Half_Pyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n=sc.nextInt();
		 //OUTER LOOP 
		   for(int i=1; i<=n ; i++) {
		  //INNER LOOP
		     for(int j =1 ; j<=i ; j++) {
		         System.out.print("*");
		     }
		System.out.println(" "); }
	}
}

//OUTPUT
/*
Enter the value of n : 4
*
**
***
****
[Program finished]
*/