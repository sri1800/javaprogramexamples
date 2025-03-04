package pattern;

import java.util.concurrent.CountDownLatch;

public class p8 

{

	public static void main(String[] args) 
	{
		int n=10;
		for(int i=1;i<=n;i=i+2)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2!=0)
				{
					System.out.print(j);
				}
			}
			System.out.println("");
		}

	}

}
