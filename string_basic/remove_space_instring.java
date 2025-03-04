package string_basic;

import java.util.Scanner;

public class remove_space_instring {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String A=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<A.length();i++)
		{
			if(A.charAt(i)!=' ')
			{
				sb.append(A.charAt(i));
			}
		}
		System.out.print(sb);
	}

}
