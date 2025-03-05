package string_basic;

import java.util.Scanner;

public class print_each_letter_twice {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String A=sc.nextLine();
		for(int i=0;i<A.length();i++)
		{
			System.out.print(A.charAt(i));
			for(int j=i;j<=i;j++)
			{
				System.out.print(A.charAt(j));
			}
		}
		sc.close();
	}

}
