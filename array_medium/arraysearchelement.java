package array_medium;
import java.util.Arrays;
import java.util.Scanner;

class arraysearchelement
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        System.out.println("Enter"+(n)+" array values from 1");
        int[]a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();  
        }
        System.out.println(Arrays.toString(a));
        Scanner s=new Scanner(System.in);
        System.out.println("Enter x value to search in array");
        int x=s.nextInt();
        int index=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]==x)
                {
                    index=i;
                }
        }
        if(index==-1)
        {
        System.out.println("-1");
        }
        else
        {
            System.out.println("index is "+index);
        }
    sc.close();
    s.close();
    } 
}