package exercise;

import java.util.*;

import strings1.Solution;

import java.lang.*;
import java.io.*;

class BinaryString
{
    public static Scanner sc = new Scanner(System.in);
	public static void main (String[] args){
        int t;
    	t=sc.nextInt();
    	sc.nextLine();
    	while((t--)!=0){
    	    int n=sc.nextInt();
    	    sc.nextLine();
    	    String s = new String();
    	    s=sc.nextLine();
    	    Solution obj = new Solution();
    	    System.out.println(obj.binarySubstring(n, s));
    	
System.out.println("~");
}
	}
}

class Solution
{
    public static int binarySubstring(int a, String str)
    {
        int count=0;
        for(int i=0;i<a;i++)
        {
            if(str.charAt(i)=='1')
            {
                count++;
            }
        }
        return (count*(count-1))/2;
    }
}