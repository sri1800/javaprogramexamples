package pattern;

public class hollow_diamond {

	public static void main(String[] args) 
	{
		int n=9;
		int a=(n/2)+1;
		int b=a;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==a || j==b )
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
		int N=9;
		int A=2;
		int B=N-1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=N;j++)
			{
				if(j==A || j==B )
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			A++;
			B--;
			System.out.println();
		}

	}

}
