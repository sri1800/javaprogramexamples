package string_basic;

import java.util.Scanner;

public class reverse_words {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        String []words=s.split("\\s");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--)
        {
            sb.append(words[i]);
            sb.append(" ");
        }
        System.out.println(sb.toString());
        sc.close();
	}

}
