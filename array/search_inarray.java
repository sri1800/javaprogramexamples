package array;

public class search_inarray {

	public static void main(String[] args) 
	{
		int[]a= {5,2,6,1,4};
		int n=a.length;
		int t=6;
		
		for(int i=0;i<n;i++)
		{
			if(a[i]==t)
			{
				System.out.println("index at= "+i+" target "+t);
			}
		}

	}

}