package string_basic;

import java.util.Scanner;

public class separate_lowercase_uppercase_instring {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String A=sc.nextLine();
		char[]x=A.toCharArray();
		StringBuilder lc=new StringBuilder();
		StringBuilder uc=new StringBuilder();
		for(int i=0;i<A.length();i++)
		{
			if(Character.isLowerCase(x[i]))
			{
				lc.append(x[i]);
			}
			else if(x[i]==' ')
			{
				
			}
			else {
				uc.append(x[i]);
			}
		}
		System.out.println(lc);
		System.out.println(uc);

	}

}
