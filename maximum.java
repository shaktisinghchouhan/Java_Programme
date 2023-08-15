
public class maximum 
{

 public static void main(String[] args) 
	{   
   int[] m= {45,40,51,75,80};
  int max = m[0];
  int i;
  for ( i=1; i<m.length; i++)
   if 
   
	  (m[i]>max)
	  max = m[i];
   System.out.println(max);
	}

}
