package PATTERN;

public class reverse_num_triangle {

	public static void main(String[] args) 
	{
		int n=9;
		int a=0;
		int b=n+1;
		for(int i=1;i<=5;i++)
		{
			int A=0;
			for(int j=0;j<=n;j++)
			{
				if(j<=a || j>=b )
				{
					System.out.print(" ");
				}
				else {
					System.out.print(A);
				}
				A++;
			}
			a++;
			b--;
			System.out.println();
		}
	}

}
