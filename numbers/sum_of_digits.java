package numbers;

import java.util.Scanner;

public class sum_of_digits {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum=0,r;
		while(num>0)
		{
			r=num%10;
			sum=sum+r;
			num=num/10;
		}
		System.out.print("sum of digits is "+sum);
		sc.close();
	}

}
