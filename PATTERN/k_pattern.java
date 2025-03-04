package pattern;

public class k_pattern {

	public static void main(String[] args) 
	{
		int n=5;
		int a=2;
		int b=n-1;
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=n;j++)
			{
				if(j>=a && j<=b)
				{
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
			}
			a++;
			System.out.println("");
		}
		int A=2;
		int B=A;
		for(int i=2;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j>=A && j<B)
				{
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
			}
			B++;
			System.out.println("");
		}

	}

}
