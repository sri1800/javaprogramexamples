import java.util.*;
import java.util.Scanner;
class Parenthesis_Checker
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of test cases");
        int n=sc.nextInt();
        for(int i=n;i>0;i--)
        {
            String s=sc.next();
            if(sample.check(s)==true)
            {
                System.out.println("true");
            }
            else
            System.out.println("false");
        }

    }
}
class sample
{
    public static boolean check(String s)
    {
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if(x=='{' || x=='[' || x=='(')
            {
                st.push(x);
            }
            else
            { 
                if (!st.empty() && ((st.peek() == '(' && x == ')') || (st.peek() == '{' && x == '}') || (st.peek() == '[' && x == ']')))
                {
                st.pop(); 
                }
            }
        }
        return st.isEmpty();

    }
}