package PATTERN;

public class p9 {
	public static void main(String[] args) 
	{
		int n=5;
		int a=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(a+" ");
				a=a+2;
			}
			System.out.println();
		}

	}

}
