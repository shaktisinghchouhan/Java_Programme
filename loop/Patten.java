package loop;

import java.util.Scanner;

public class Patten
{
  public static void main(String[] args) 
  {
	/* Scanner sc=new Scanner (System.in);
	System.out.println("Enter number");
	 int n=sc.nextInt();
	 for(int i=1;i<=n;i++)
	 {
		 System.out.print(i*(i+1)/2+"  ");
	 }  */
	  int j=1;
	  Scanner sc=new Scanner (System.in);
		System.out.println("Enter number");
		 int n=sc.nextInt();
		 for(int i=1;i<=n;i++)
		 {
			 System.out.print(i+j+"  ");
			 j--;
		 }
}

}
