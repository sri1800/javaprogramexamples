package sorting;

public class insertionsort {

	public static void main(String[] args) 
	{
		int[]a= {36,18,26,12,5,54};
		int n=a.length;
		int temp,j;
		for(int i=1;i<n;i++)
		{
			temp=a[i];
			j=i;
			while(j>0 && a[j-1]>temp)
			{
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		for(int i=0;i<n;i++) 
		{
			System.out.print(a[i]+" ");	
		}

	}

}
