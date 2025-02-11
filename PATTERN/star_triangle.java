package PATTERN;

public class star_triangle {

	public static void main(String[] args) 
	{
		int n=7;
		int a=(n/2)+1;
		int b=a;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j>=a && j<=b)
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
