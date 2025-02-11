package arrays1;
import java.util.*;
class FloorinaSortedArray

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
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Scanner s=new Scanner(System.in);
        System.out.println("Enter k value to check in array");
        int k=s.nextInt();
        int index=-1;
        for(int j=0;j<n;j++)
        {
            if(a[j]<=k)
            {
                index++;
            }
        }
        if(index!=-1)
        {
            System.out.println("At index "+index);
        }
        else{
            System.out.println("-1");
        }
    }
}