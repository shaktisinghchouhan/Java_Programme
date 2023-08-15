
public class minimum {

	public static void main(String[] args) {
	int[] mini= {14,18,45,25,65};
	int minimum = mini[0];
	int i;
	for (i=1; i<mini.length; i++)
	{
		if (minimum<i);
		i=minimum;
	}
	System.out.println(minimum);
	}

}
