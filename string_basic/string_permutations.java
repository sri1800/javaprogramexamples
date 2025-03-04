package string_basic;

import java.util.Scanner;

public class string_permutations 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String A=sc.nextLine();
		permute(A, "");
	}	
		static void permute(String A,String prefix)
		{
			if(A.length()==0)
			{
				System.out.println(prefix);
			}
			else 
			{
				for(int i=0;i<A.length();i++)
				{
					String rest=A.substring(0,i)+A.substring(i+1);
					permute(rest, prefix + A.charAt(i));
				}
			}

		}
}
