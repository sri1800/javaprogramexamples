package sorting;

public class mergesort 
{

	public static void main(String[] args) 
	{
		int[]a= {36,18,26,12,5,54};
		int l=a.length;
		mergesort(a);
		
		
		for(int i=0;i<l;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

	private static void mergesort(int[] a) 
	{
		
		int l=a.length;
		if(l<2) 
		{
			return;
		}
		int mi=a.length/2;
		int []left=new int[mi];
		int []right=new int[a.length-mi];
		
		for(int i=0;i<mi;i++)
		{
			left[i]=a[i];
		}
		for(int j=mi;j<a.length;j++)
		{
			right[j-mi]=a[j];
		}
		
		mergesort(left);
		mergesort(right);
		mergesort(a,left,right);
		
	}

	private static void mergesort(int[] a, int[] left, int[] right) 
	{
		int i=0,j=0,k=0;
		int ll=left.length;
		int rl=right.length;
		
		while(i<ll && j<rl)
		{
			if(left[i]<=right[j])
			{
				a[k]=left[i];
				i++;
				k++;
			}
			else {
				a[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<ll)
		{
			a[k]=left[i];
			i++;
			k++;
		}
		while(j<rl)
		{
			a[k]=right[j];
			j++;
			k++;
		}
	}

}
