package PATTERN;

public class number_inc_pyramid {

	public static void main(String[] args) 
	{
		int a=1;
		for(int i=1;i<=5;i++)
		{
			a=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(a);
				a++;
				System.out.print(" ");
			}
			
			System.out.println("");
		}

	}

}
