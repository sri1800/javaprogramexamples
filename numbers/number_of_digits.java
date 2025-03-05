package numbers;

import java.util.Scanner;

public class number_of_digits {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp1;
		int count=0;
		temp1=num;
		while(temp1!=0)
		{
			temp1=temp1/10;
			count++;
		}
		System.out.println("Number of digits in "+num+ " are "+count);
		sc.close();
	}
	
}
