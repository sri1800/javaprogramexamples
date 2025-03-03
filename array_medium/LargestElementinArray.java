package arrays1;
import java.util.*;
class LargestElementinArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        System.out.println("Enter array"+(n)+"elements");
        int[]a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();  
        }
        System.out.println(Arrays.toString(a));
        int l=a[0];
        for(int j=0;j<n;j++)
        {
            if(a[j]>=l)
            {
                l=a[j];
            }
        }
        System.out.println(l);
    }
}