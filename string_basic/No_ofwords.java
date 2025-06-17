package string_basic;

import java.util.Scanner;

public class No_ofwords {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        
        
        int x=s.split(" ").length;
        System.out.println(x);
        
        
        int count=1;
        for(int i=0;i<s.length();i++)
        {
        	if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
        	{
        		count++;
        	}
        }
        System.out.println(count);
        sc.close();
	}

}
