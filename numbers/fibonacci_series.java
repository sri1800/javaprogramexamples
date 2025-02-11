package numbers;

import java.util.Scanner;

public class fibonacci_series {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a range number");
		int num=sc.nextInt();
		int f=0,s=1,next;
		
		for(int i=0;i<num;i++)
		{
			System.out.print(f+" ");
			next=f+s;
			f=s;
			s=next;
		}

	}

}
