package array_basic;

public class largest_smallest_inarray {

	public static void main(String[] args) 
	{
		int[]a= {5,2,6,1,4};
		int n=a.length;
		int l=a[0];
		int s=a[0];
		
		for(int i=1;i<n;i++)
		{
			if(l<a[i])
			{
				l=a[i];
			}
			else if(s>a[i])
			{
				s=a[i];
			}
		}
		System.out.println(l);
		System.out.println(s);

	}

}
