package string;
import java.util.Arrays;
import java.util.Scanner;

public class string_anagrams {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String");
		String A=sc.nextLine();
		System.out.println("Enter second String");
		String B=sc.nextLine();
		System.out.println(anagrams(A,B));
	}
		
		static boolean anagrams(String A,String B)
		{
			if(A.length()!=B.length())
			{
				return false;
			}
			else 
			{
				/*int[]charcount=new int[256];
				for(int i=0;i<A.length();i++)
				{
					charcount[A.charAt(i)]++;
					charcount[B.charAt(i)]--;
				}
				for(int count:charcount)
				{
					if(count!=0)
					{
						return false;
					}
				}
				return true;*/
				char[]a=A.toCharArray();
				char[]b=B.toCharArray();
				Arrays.sort(a);
				Arrays.sort(b);
				for(int i=0;i<a.length;i++)
				{
					if(a[i]!=b[i])
					{
						return false;
					}
				}
				return true;
			}
		}
		
	}
