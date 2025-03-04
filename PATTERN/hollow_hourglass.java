package pattern;

public class hollow_hourglass {

	public static void main(String[] args) 
	{
		int n=9;
		int a=1;
		int b=n;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==a || j==b || (i==1 && j%2!=0))
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
		int N=9;
		int A=(N/2);
		int B=A+2;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=N;j++)
			{
				if(j==A || j==B || (i==4 && j%2!=0))
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			A--;
			B++;
			System.out.println();
		}


	}

}
