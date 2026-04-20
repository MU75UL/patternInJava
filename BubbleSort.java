import java.util.*;
public class BubbleSort{
    public static void BubSort( int arr[]){
        // array after  bubble sorting
 for( int j=0; j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
    public static void main(String[] args ) {
        
        int arr [] = {0,1,2,3,9,8,7,6,5,4};
              System.out.println("Array before bubble sorting");
         for( int j=0; j<arr.length;j++){
            System.out.println(arr[j]);
        }

        for( int i=0;i<arr.length;i++){
            for( int k=0;k < arr.length-i-1;k++){
                if(arr[k]>arr[k+1]){
                    int temp = arr[k];
                        arr[k]=arr[k+1];
                        arr[k+1]=temp;
                }
            }
        }
        System.out.println("Array after bubble sorting");
        BubSort(arr);
       
    }
}