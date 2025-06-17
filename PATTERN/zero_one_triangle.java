package pattern;

public class zero_one_triangle {

	public static void main(String[] args) 
	{
		int n=5;
		int a=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0 && a==0 && j%2!=0)
				{
				a=1;
				}
				System.out.print(a);
				if(a==1)
				{
					a--;
				}
				else {
					a++;
				}
			}
			
			System.out.println();
		}

	}

}
