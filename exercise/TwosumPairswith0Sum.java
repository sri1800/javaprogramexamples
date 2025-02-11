package exercise;
import java.util.*;
class TwosumPairswith0Sum
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
        int[]b={0,0};
        for(int j=0;j<n;j++)
        {
            for(int k=j+1;k<n;k++)
            {
                if(a[j]+a[k]==0)
                {
                    if(a[j]<a[k])
                    {
                        b[0]=a[j];
                        b[1]=a[k];
                    }
                    else
                    {
                        b[0]=a[k];
                        b[1]=a[j];
                    }
                    System.out.println("["+b[0]+","+b[1]+"]");
                }
            }
        }
    }
}