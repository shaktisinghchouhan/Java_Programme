
public class JavaMaximumValue {

	public static void main(String[] args) {
	int[]  a= {15,10,8,40,90};
		int max = a[4];
	for (int i=a.length-1; i>=0; i--)
	{
		if (max<a[i])
			max=a[i];
	}
		

	System.out.println("Maximum element is"+"     " +max);

		
	}

}


