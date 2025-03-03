package string;

import java.util.HashSet;
import java.util.Scanner;

public class longest_without_repeating {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String");
		String A=sc.nextLine();
		HashSet<Character> set=new HashSet<Character>();
		int ml=0;
		int e=0;
		int s=0;
		while(e<A.length())
		{
			char c=A.charAt(e);
			if(!set.contains(c))
			{
				set.add(c);
				ml=Math.max(ml,e-s+1);
				e++;
			}
			else {
				set.remove(A.charAt(s));
				s++;
			}
		}
		System.out.println(ml);
	}

}
