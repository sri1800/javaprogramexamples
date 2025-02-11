package numbers;

import java.util.Scanner;

public class reverse_number {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int rev=0,r;
		while(num>0)
		{
			r=num%10;
			/*if(r==0)
			{
				System.out.print(r);
			}*/
			rev=rev*10+r;
			num=num/10;
		}
		System.out.print(rev);
	}

} 
