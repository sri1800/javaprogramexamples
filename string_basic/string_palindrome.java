package string_basic;

import java.util.Scanner;

public class string_palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String A=sc.nextLine();
		int l=A.length();
		int s=0;
		int e=l-1;
		int x=0;
		while(s<e)
		{
			if(A.charAt(s)!=A.charAt(e))
			{
				break;
			}
			else {
				x=1;
			}
			s++;
			e--;
		}
		if(x==1)
		{
			System.out.println(A+" is a palindrome");
		}
		else {
			System.out.println(A+" Not a palindrome");
		}
	}
}
