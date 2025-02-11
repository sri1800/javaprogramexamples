package string;

import java.util.Scanner;

public class reverse_eachword {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		String []words=s.split(" ");
		String r="";
        for(int i=0;i<words.length;i++)
        {
        	String x= words[i];
        	String y="";
        	for(int j=0;j<x.length();j++)
        	{
        		y=x.charAt(j)+y;
        	}
        	r=r+y+" ";
        }
        System.out.println(r);
	}

}
