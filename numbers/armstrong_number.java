package numbers;

import java.util.Scanner;

public class armstrong_number {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp1,temp2,r;
		int arm=0;
		int count=0;
		temp1=num;
	
		while(temp1!=0)
		{
			temp1=temp1/10;
			count++;
		}
		temp2=num;
		while(temp2!=0)
		{
			r=temp2%10;
			int mul=1;
			for(int i=1;i<=count;i++)
			{
				mul=mul*r;
			}
			arm=arm+mul;
			temp2=temp2/10;
		}
		if(num==arm)
		{
			System.out.println(num+" is armstrong number");
		}
		else {
			System.out.println(num+" is not armstrong number");
		}
	}

}
