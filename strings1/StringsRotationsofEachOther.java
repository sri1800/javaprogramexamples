package strings1;
import java.util.*;
class StringsRotationsofEachOther
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two string");
        String s=sc.nextLine();
        String r=sc.nextLine();
        //System.out.println(s);
        //System.out.println(r);
        String mix=s+s;
        int n=s.length();
        int m=r.length();
        if(n==m)
        {
            if(mix.contains(r))
            {
                System.out.println("true"); 
            }
            else
            {
                System.out.println("false");
            }
        }
        else
        {
            System.out.println("false");
        }
    }
}