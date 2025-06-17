package pattern;

public class palindrome_triangle {

	public static void main(String[] args) 
	{
		int n=10;
		int a=n/2;
		int b=a;
		int A=1;
		for(int i=1;i<=5;i++)
		{
			for (int j=1;j<=n;j++)
			{
				
				if(j==n/2 )
				{
					A=1;
				}
				else if((j==a && j<n/2) || (j>n/2 && j<=b))
				{
					A++;
				}
				else if(j>a && j<=n/2)
				{
					A--;
				}
				
				if(j>=a && j<=b)
				{
					System.out.print(A);
				}
				else {
					System.out.print(" ");
				}
				
			}
			a--;
			b++;
			
			System.out.println();
		}

	}

}
