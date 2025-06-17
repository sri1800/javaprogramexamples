package pattern;

public class hollow_triangle {

	public static void main(String[] args) 
	{
		int n=9;
		int a=(n/2)+1;
		int b=a;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==a || j==b || (i==5 && j%2!=0))
				{
					System.out.print("*");
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
