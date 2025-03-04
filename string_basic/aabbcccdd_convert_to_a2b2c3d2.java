package string_basic;

import java.util.Scanner;

public class aabbcccdd_convert_to_a2b2c3d2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String A=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		int count=1;
		for(int i=0;i<A.length();i++)
		{
			if((i+1)<A.length() && A.charAt(i)==A.charAt(i+1))
			{
				count++;
			}
			else {
				sb.append(A.charAt(i)).append(count);
				count=1;
			}
		}
		System.out.println(sb);
	}

}
