package array_basic;

//import java.util.Arrays;

public class sorting_without_method {

	public static void main(String[] args)
	{
		int[]a= {5,2,6,1,4};
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[i])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		/*System.out.println(Arrays.toString(a));*/
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
