import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringEvenandOdd {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of test cases");
        int T=sc.nextInt();
        sc.nextLine();
        for(int j=1;j<=T;j++)
        {
        System.out.println("Enter a string");
        String S=sc.nextLine();
        int n=S.length();
        String E="";
        String O="";
        for(int i=0;i<n;i++)
        {
            if(i==0 || (i%2==0))
            {
                E=E+S.charAt(i); 
            }
            else{
                O=O+S.charAt(i);
            } 
        }
        System.out.println(E+" "+O);
        }
        
    }
}