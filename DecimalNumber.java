
import java.util.*;
class DecimalToBinary
 {
 public static void main (String[] args )
 { 
 Scanner s = new Scanner(System.in);
 int num, arr [ ] = new int[15], i, j ;
 System.out.println ("Enter a decimal number:");
 num = s.nextInt();
 i=0;
 while(num>0) 
 {
 arr [i] =num%2; 
 num/=2;
 i++;
 }
 System.out.print ("Binary number is : ") ; 
 for(j=i-1;j>=0;j--) /* print the array backwards */ 
 System.out.printf("%d",arr[j]); 
}
}