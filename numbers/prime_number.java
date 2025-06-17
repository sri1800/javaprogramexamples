package numbers;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int x=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println(num+" is not a prime number");
				break;
			}
			else {
				 x=1;
			}
		}
		if(x==1)
		{
			System.out.println(num+" is a prime number");
		}
		sc.close();
	}

}
