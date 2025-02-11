package sorting;

public class quicksort {

	public static void main(String[] args) 
	{
		int[]a= {36,18,26,12,5,54};
		int n=a.length;
		
		quicksort(a,0,n-1);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

	private static void quicksort(int[] a, int low, int high) 
	{
		if(low<high)
		{
			int pi=partition(a,low,high);
			quicksort(a,low,pi-1);
			quicksort(a,pi+1,high);
		}
		
	}

	private static int partition(int[] a, int low, int high) 
	{
		int pivot=a[high];
		int i=low-1;
		for(int j=low;j<high;j++)
		{
			if(a[j]<pivot)
			{
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
		}
		i++;
		int temp=a[i];
		a[i]=pivot;
		a[high]=temp;
		return i;
	}

}
