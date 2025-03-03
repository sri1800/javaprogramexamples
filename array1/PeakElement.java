package arrays1;
import java.util.*;
class PeakElement
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
        boolean x=false;
        int value=-1;
        int index=-1;
        for(int j=0;j<n;j++)
        {
            for(int k=j+1;k<n;k++)
            {
                for(int l=k+1;l<n;l++)
                {
                    if((a[j]<a[k]) && (a[k]>a[l]))
                    {
                        x=true;
                        value=a[k];
                        index=k;
                    }
                }
            }
        }
        System.out.println(x);
        System.out.println(value +"  at index  "+index+"  is peak element");
    }
}