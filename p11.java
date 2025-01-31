package PATTERN;

public class p11 {

	public static void main(String[] args) 
	{
		int n=5;
		char c='a';
		for(int i=1;i<=n;i++)
		{
			c='a';
			for(int j=1;j<=i;j++)
			{
				System.out.print(c);
				c++;
			}
			
			System.out.println("");
		}

	}

}
