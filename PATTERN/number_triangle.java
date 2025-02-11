package PATTERN;

public class number_triangle {

	public static void main(String[] args) 
	{
		int n=7;
		int a=(n/2)+1;
		int b=a;
		int N=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==a || j==b || (i>=4 && j%2!=0))
				{
					System.out.print(N);
				}
				else {
					System.out.print(" ");
				}
			}
			a--;
			b++;
			N++;
			System.out.println();
		}

	}

}
