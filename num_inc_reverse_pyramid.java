package PATTERN;

public class num_inc_reverse_pyramid 
{
	public static void main(String[] args) 
	{
		int a=1;
		int m=5;
		for(int i=1;i<=5;i++)
		{
			a=1;
			for(int j=1;j<=m;j++)
			{
				System.out.print(a);
				a++;
				System.out.print(" ");
			}
			m--;
			System.out.println("");
		}

	}
}
