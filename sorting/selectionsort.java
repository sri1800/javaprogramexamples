package sorting;
public class selectionsort 
{
	public static void main(String[] args) 
	{
		int[]a= {36,18,26,12,5,54};
		int n=a.length;
		int min,temp=0;
		for(int i=0;i<n;i++)
		{
			min=i;
			for(int j=i+1;j<n;j++)
			{
				//if(a[j].compareTo(a[min])<0)
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<n;i++) 
		{
			System.out.print(a[i]+" ");	
		}
	}

}
