package strings_medium;
import java.io.*;
import java.util.*;

class LongestCommonPrefixofStrings
{
    public static void main(String args[]) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int t = sc.nextInt();
        String[]arr=new String[t];
        for(int j=0;j<t;j++)
        {
            System.out.print("Enter string " + (j + 1) + ": ");
            arr[j] = sc.next();
        }
        System.out.println(Arrays.toString(arr));
        if(arr.length==0)
        {
            System.out.print("\"\"");
        }
        Arrays.sort(arr);
        String f=arr[0];
        String l=arr[arr.length-1];
        
        int i=0;
        while(i<f.length() && i<l.length() && f.charAt(i)==l.charAt(i))
        {
            i++;
        }
        System.out.println(f.substring(0,i));
    }
}
 