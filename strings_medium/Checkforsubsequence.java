package strings_medium;

import java.io.*;
import java.util.*;
class Checkforsubsequence
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            
            String a = sc.next();
            String b = sc.next();
            Solution ob = new Solution();
            if(ob.isSubSequence(a,b))
            System.out.println(1);
            else
            System.out.println(0);
 		
        
System.out.println("~");
}
    }
}

class Solution
{
    boolean isSubSequence(String A, String B)
    {
        int m=A.length();
        int n=B.length();
        int j=0;
        for(int i=0;i<n;i++)
        {
                if(A.charAt(j)==B.charAt(i))
                {
                    j++;
                }
            if(m==j)
            {
            return true;
            }
        }
        return false;
    }
}