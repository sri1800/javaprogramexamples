package array;

public class odd_even_count {

	public static void main(String[] args) 
	{
		int[]a= {5,2,6,1,4,5,6,7,2,8,4,9};
		int n=a.length;
		int e=0;
		int o=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				e++;
			}
			else {
				o++;
			}
		}
		System.out.println(e);
		System.out.println(o);
	}

}
