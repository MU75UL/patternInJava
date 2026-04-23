// print diamond patterns
import java.util.*;
public class Diamond {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the value of n : ");
	int n = sc.nextInt();
	//1st half diamond
		for(int i =1; i<=n; i++){
		// space 
		for(int j=1 ; j<=n-i ; j++){
		 System.out.print(" ");
		 }
		 //print("*")
		 for(int j=1; j<=2*i-1;j++){
          System.out.print("*");		 	
		 }	
		 	System.out.println(" ");
		 }
		  
		 //2nd half diamond
		for(int i =n; i>=1; i--){
		// space 
		for(int j=1 ; j<=n-i ; j++){
		 System.out.print(" ");
		 }
		 //print("*")
		 for(int j=1; j<=2*i-1;j++){
          System.out.print("*");	}
       System.out.println(" ");   	 	
	}
}
}