package string_basic;

import java.util.Scanner;

public class separate_0s_from_String {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String A=sc.nextLine();
		StringBuilder d=new StringBuilder();
		StringBuilder z=new StringBuilder();
		for(int i=0;i<A.length();i++)
		{
			if(A.charAt(i)=='0')
			{
				z.append(A.charAt(i));
			}
			else {
				d.append(A.charAt(i));
			}
		}
		System.out.println(d);
		System.out.println(z);
		sc.close();
	}

}
