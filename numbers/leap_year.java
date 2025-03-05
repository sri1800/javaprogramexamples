package numbers;

import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) 
	{
		System.out.println("Enter the year to find leap year");
		Scanner scr = new Scanner(System.in);
		int x=scr.nextInt();
		
		if(x%4==0)
		{
			System.out.println("yes");
		}
		else if(x%100==0 && x%400==0)
		{
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		scr.close();
	}

}
