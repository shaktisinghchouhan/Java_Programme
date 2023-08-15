import java.util.*;
class ArrayReverse
 {
 public static void main (String[] args )
 { 
 Scanner s = new Scanner(System.in);
 int i,j,temp,arr[ ] = {1,2,3,4,5,6,7,8,9,10};
 for(i=0,j=arr.length-1;i<j;i++,j--)
 { temp=arr[i];
 arr [i] =arr [j] ;
 arr[j]=temp; 
 }
 System.out.println ("After reversing the array is:"  );
 for(i=0;i<arr.length;i++) 
 System.out.print(arr[i] + " ") ;
}
}