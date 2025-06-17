package string_basic;

import java.util.Scanner;

public class unique_instring {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String x=sc.nextLine();
		String A=x.toLowerCase();
		boolean []c=new boolean[128];
		for(int i=0;i<A.length();i++)
		{
			char ch=A.charAt(i);
			if(!c[ch])
			{
				c[ch]=true;
				System.out.print(ch+" ");
			}
		}
		sc.close();
	}

}
