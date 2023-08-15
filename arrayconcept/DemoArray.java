package arrayconcept;

import java.util.Scanner;

public class DemoArray 
{

	public static void main(String[] args) 
		// TODO Auto-generated method stub
{/*
int raja [] = new int [4];
raja [0] = 10;
raja [1] = 25;
raja [2] = 30;
raja [3] = 35;
for (int i=0; i<raja.length; i++)
{
	System.out.println(raja[i]);
	
}*/
		
	int sum=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int [] ar=new int [size];
        System.out.println("enter array elements");
        for(int i=0;i<size;i++)
        {
        	ar[i]=sc.nextInt();
        }
        System.out.println("Entered array element");
        for(int i=0;i<size;i++)
        {  
        //	System.out.println(ar[i]);
           sum =sum+ar[i];
          
        }
        System.out.println(sum);
}
}