import java.util.Arrays;
import java.util.Scanner;

class MinandMaxinArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        System.out.println("Enter "+(n)+" array values");
        int[]a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();  
        }
        System.out.println(Arrays.toString(a));
        int lv=a[0];
        int hv=a[n-1];
        for(int i=0;i<n;i++)
        {
            if(a[i]<lv)
            {
                lv=a[i];
            }
            if(a[i]>hv)
            {
                hv=a[i];
            }
        }
        System.out.println("min value is "+lv);
        System.out.println("max value is "+hv);
    }
}