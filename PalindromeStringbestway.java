import java.io.*;

class PalindromeStringbestway
{
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine(); // Use lowercase 's'

            Solution ob = new Solution();
            if (ob.isPalindrome(s)) // Check palindrome
                System.out.println("true");
            else
                System.out.println("false");
            System.out.println("~");
        }
    }
}

class Solution {
    boolean isPalindrome(String s) {
        int n=s.length();
        int l=n-1;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==s.charAt(l))
            {
                l--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}