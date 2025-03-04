package pattern;

public class butterfly {

	public static void main(String[] args) 
	{
		int n=9;
		int a=1;
		int b=n;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=a || j>=b)
				{
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			a++;
			b--;
			System.out.println();
		}
		int A=n/2+1;
		int B=A;
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=n;j++)
			{
				if(j>=A && j<=B)
				{
				System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			A--;
			B++;
			System.out.println();
		}

	}

}
