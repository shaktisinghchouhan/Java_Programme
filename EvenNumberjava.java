
public class EvenNumberjava {

	public static void main(String[] args) {
	
		 int[] a= {25,41,13,87,56,};
		 int i;
		 int even=0;
		 int odd=0;
		 int j;
 
		 for (i=0; i<a.length;i++) {
			 if  (a[i]%2==0)
				 even++;
			 
			
				 odd++;
			
		 }
		 
		 System.out.printf("Even numbers %d \n", even);
		 System.out.printf("odd numbers %d", odd);
 
	}

}

