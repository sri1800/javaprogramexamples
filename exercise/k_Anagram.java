package exercise;
import java.lang.*;
import java.util.*;

class k_Anagram
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str1 = sc.next();
            String str2 = sc.next();
            int k = sc.nextInt();
            Solution ob = new Solution();
            if (ob.areKAnagrams(str1, str2, k) == true)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}

class Solution 
{
    boolean areKAnagrams(String s1, String s2, int k) 
    {
        int l1=s1.length();
        int l2=s2.length();
        if(l1!=l2)
        {
            return false;
        }
        else
        {
            HashMap<Character, Integer> map=new HashMap<>();
            for(int i=0;i<l1;i++)
            {
                char ch=s1.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            for(int i=0;i<l2;i++)
            {
                 char ch=s2.charAt(i);
                 if(map.getOrDefault(ch,0)>0)
                 {
                     map.put(ch,map.get(ch)-1);
                 }
            }
            int count=0;
            for(char ch:map.keySet().toArray(new Character[0]))
            {
                count+=map.get(ch);
            }
            if(count>k)
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