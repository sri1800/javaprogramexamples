package string_basic;

import java.util.Scanner;

public class even_index_instring {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String A=sc.nextLine();
		for(int i=0;i<A.length();i++)
		{
			if(i%2==0)
			{
				System.out.println(A.charAt(i));
			}
		}
		sc.close();
	}

}
