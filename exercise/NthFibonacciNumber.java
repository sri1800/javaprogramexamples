
import java.util.*;
class NthFibonacciNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value to find nth fibonacci number");
        int n=sc.nextInt();
        int[]a=new int[n+1];
        for(int i=2;i<=n;i++)
        {
            a[0]=0;
            a[1]=1;
            a[i]=a[i-1]+a[i-2];
        }
        System.out.println(a[n]);
        sc.close();
    }
}