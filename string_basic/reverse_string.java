package string_basic;

import java.util.Scanner;

public class reverse_string {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String A=sc.nextLine();
		String B="";
		int l=A.length();
		for(int i=l-1;i>=0;i--)
		{
			B=B+A.charAt(i);
		}
		System.out.println("Reverse of "+A+" is "+B);
	}

}
