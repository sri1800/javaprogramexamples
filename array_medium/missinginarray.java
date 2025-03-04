package array_medium;
import java.util.*;
class missinginarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        System.out.println("Enter"+(n-1)+" array values from 1");
        int[]a=new int[n];
        for(int i=0;i<n-1;i++)
        {
            a[i]= sc.nextInt();  
        }
        int sum=(n*(n+1))/2;
        int sumarr=0;
        for(int i=0;i<n;i++)
        {
            sumarr+=a[i]; 
        }
        int mn=sum-sumarr;
        System.out.println("missing no is "+mn);

    }
}