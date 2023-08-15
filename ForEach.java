import java.util.*;
public class ForEach
{
public static void main(String[]args)
 {
  Scanner Sc= new Scanner(System.in);
  System.out.println("Enter array Elements");
int i;
int j;
int k;
int temp=0;
int ar[];
 for (i=0;i<=ar.length; i++)
     { ar[i]= Sc.nextInt();
     }
 for (j=0; j<=ar.length; j++)
   { 
	 for (k=0; k<=ar.length; k++)
      {
        if(ar[k]>ar[k+1])
        {
         temp = ar[k];
         ar[k]= ar[k+1];
         ar[k+1]=temp;
        }
     }
  }
    System.out.println("Elements of array is");
    
   for   (int p:temp) {
	   System.out.println(p);
 
   }
	      
 }
}