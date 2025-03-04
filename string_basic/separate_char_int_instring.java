package string_basic;

import java.util.Scanner;

public class separate_char_int_instring {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String A=sc.nextLine();
		char[]x=A.toCharArray();
		StringBuilder c=new StringBuilder();
		StringBuilder n=new StringBuilder();
		for(int i=0;i<A.length();i++)
		{
			if(Character.isAlphabetic(x[i]))
			{
				c.append(x[i]);
			}
			else if(x[i]==' ')
			{
				
			}
			else {
				n.append(x[i]);
			}
		}
		System.out.println(c);
		System.out.println(n);

	}

}
