import java.util.*;
class BinarySearch
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
        int low=0;
        int high=n-1;
        int index=0;
        boolean x=true;
        while (x)
        {
            int mid=(low+high)/2;
            System.out.println("line28");
            if (k == a[mid])
            {
                index=index+mid;
                break;
            }
            else if(k > a[mid])
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }  
        }
        if(index>0)
        {
            System.out.println(index);
        }
        else{
        System.out.println("-1");
        }
    }
}