package string;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class duplicates_in_string {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		char[] x=s.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<Character, Integer>();
		for(char c:x) 
		{
			if(hm.containsKey(c)) 
			{
				hm.put(c,hm.get(c)+1);
			}
			else 
			{
				hm.put(c,1);
			}
		}
		System.out.println(hm);
	}

}
