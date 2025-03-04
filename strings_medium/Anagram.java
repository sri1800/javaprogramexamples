package strings_medium;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.*;

class Anagram
 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s1 = br.readLine(); 
            String s2 = br.readLine(); 

            Solution obj = new Solution();

            if (obj.areAnagrams(s1, s2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            System.out.println("~");
        }
    }
}

class Solution {
        public static boolean areAnagrams(String s1, String s2) {

        char[]a=s1.toCharArray();
        char[]b=s2.toCharArray();
        int l1=s1.length();
        int l2=s2.length();
        int flag=0;
        int []A=new int [26];
        int []B=new int [26];
        if(l1!=l2)
        {
            return false;
        }
        else
        {
            for(int i=0;i<l1;i++)
            {
                A[a[i]-'a']++;
                B[b[i]-'a']++;
            }
            for(int i=0;i<26;i++)
            {
                if(A[i]!=B[i])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        
    }
}