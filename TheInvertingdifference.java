import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math.*;

class TheInvertingdifference
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        System.out.println("Enter"+(n)+" array values ");
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();  
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int []reverse=new int[n];
        for(int i=0;i<n;i++)
        {
        int reversed = 0;
        int num=arr[i];
         while (num != 0) 
         {
        int remainder = num % 10;
        reversed = reversed * 10 + remainder;
        num /= 10;
        }
        reverse[i]=reversed;
        }
        System.out.println(Arrays.toString(reverse));
        int[]dif=new int[n];
        for(int i=0;i<n;i++)
        {
                int d=Math.abs(arr[i]-reverse[i]);
                //System.out.println(d);
                dif[i]=d;            
        }
        Arrays.sort(dif);
        System.out.println(Arrays.toString(dif));
        System.out.println(dif[0]);
    }
}
