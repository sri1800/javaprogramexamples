package numbers;

import java.util.Scanner;

public class square_root {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number to find the square root");
		Scanner scr = new Scanner(System.in);
		int x=scr.nextInt();
		
		for(int i=1;i<=x;i++)
		{
			int r=x%i;
			if(r==0 && (x/i)==i)
			{
				System.out.println(i);
				break;
			}
		}

	}

}
