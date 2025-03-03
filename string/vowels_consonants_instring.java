package string;

import java.util.Scanner;

public class vowels_consonants_instring {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String x=sc.nextLine();
		String A=x.toLowerCase();
		int v=0;
		int c=0;
		int s=0;
		int l=A.length();
		for(int i=0;i<l;i++)
		{
			if(A.charAt(i)=='a' ||A.charAt(i)=='e' ||A.charAt(i)=='i' ||A.charAt(i)=='o' ||A.charAt(i)=='u' ) {
				v++;
			}
			else if(A.charAt(i)==' ') 
			{
				s++;
			}
			else {
				c++;
			}
		}
		System.out.println("vowels in "+A+" :"+v);
		System.out.println("consonants in "+A+" :"+c);
	}

}
