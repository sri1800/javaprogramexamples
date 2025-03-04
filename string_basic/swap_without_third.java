package string_basic;

import java.util.Scanner;

public class swap_without_third {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String");
		String A=sc.nextLine();
		System.out.println("Enter second String");
		String B=sc.nextLine();
		A=A+B;
		B=A.substring(0,A.length()-B.length());
		A=A.substring(B.length());
		System.out.println(A);
		System.out.println(B);
	}

}

