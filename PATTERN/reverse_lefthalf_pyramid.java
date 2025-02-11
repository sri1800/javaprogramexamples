package PATTERN;

public class reverse_lefthalf_pyramid {

	public static void main(String[] args) 
	{
		int n=6;
		int a=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j!=a && j>a)
				{
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			a++;
			System.out.println("");
		}
	

	}

}
