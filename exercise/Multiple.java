package exercise;
import java.util.*;
class Multiple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int x=0;
        for(int i=1;i<=10;i++)
        {
            x=n*i;
            System.out.println(n+" x "+i+" = "+x);
        }

    }
}