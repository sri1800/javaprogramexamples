package PATTERN;

public class rhombus {

	public static void main(String[] args) 
	{
		int n=5;
		int m=5;
		int a=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j>=a)
				{
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			a++;
			m++;
			System.out.println();
		}

	}

}
