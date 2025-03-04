package strings_medium;
import java.io.*;
import java.util.*;

class NonRepeatingCharacter
{
    public static void main(String args[]) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a strings: ");
        String s=sc.nextLine();
        int n=s.length();
        
        for(int i=0;i<n;i++)
        {
            boolean x=true;
            for(int j=i+1;j<n;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    x=false;
                    break;
                }
            }
            if(x)
            {
                System.out.println(s.charAt(i));
                break;
            } 
        }
    }
}
        