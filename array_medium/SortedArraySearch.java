package array_medium;
import java.io.*;
import java.lang.*;
import java.util.*;

class SortedArraySearch 
{

    public static void main(String args[]) throws IOException 
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) 
        {
            String inputLine[] = read.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) 
            {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int k = Integer.parseInt(read.readLine());

            Solution obj = new Solution();

            System.out.println(obj.searchInSorted(arr, k));
        }
    }
}
class Solution
{
    static boolean searchInSorted(int arr[], int k) 
    {
        boolean x=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==k)
            {
            x=true;
            }
        }
        return x;
    }
}