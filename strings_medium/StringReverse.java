package strings_medium;
import java.util.*;
class StringReverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        System.out.println(s);
        String []words=s.split("\\s");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--)
        {
            sb.append(words[i]);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
