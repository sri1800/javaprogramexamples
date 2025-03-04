package array_medium;
import java.util.Arrays;
import java.util.Scanner;

class FrequenciesofLimitedRangeArrayElements

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
        int p=n+1;
        for(int i=0;i<n;i++)
        {
            int idx=a[i]%p-1;
            if(idx>=0 && idx<n)
            {
                a[idx]+=p;
            }
        }
        for(int i=0;i<n;i++)
        {
            a[i]/=p;
        }
        System.out.println(Arrays.toString(a));
    sc.close();   
    }
}