package strings1;
import java.util.*;
class PalindromeString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        String r="";
        for(int i=0;i<s.length();i++)
        {
            r=s.charAt(i)+r;
        }
        System.out.println(r);
        if(s.equals(r))
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}