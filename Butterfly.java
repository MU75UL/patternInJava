// print Butterfly patterns
import java.util.*;
public class Butterfly {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the value of n : ");
	int n = sc.nextInt();
	for(int i=1; i<=n; i++){
	 
	   //UPPER CASE  
	   //1st half print("*") 
	   for(int j=1 ; j<=i ; j++){
	   	System.out.print("*");
	   	}
	   //space
	   for(int j=1;j<=2*(n-i) ;j++){
	   	System.out.print(" ");
	   	}
	   // 2nd half print("*")
	   for(int k=1; k<=i;k++){
	   	System.out.print("*");
	   }
	   System.out.println("	");
	}
	
	//LOWER CASE
		for(int i=n; i>=1; i--){
	   
	   //1st half print("*") 
	   for(int j=1 ; j<=i ; j++){
	   	System.out.print("*");
	   	}
	   //space
	   for(int j=1;j<=2*(n-i) ;j++){
	   	System.out.print(" ");
	   	}
	   // 2nd half print("*")
	   for(int k=1; k<=i;k++){
	   	System.out.print("*");
	   }
	   System.out.println("	");
	}
}
}