import java.util.*;
class Reversearrayingroups
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
        Scanner s=new Scanner(System.in);
        System.out.println("Enter k value to reverse array before kth value");
        int k=s.nextInt();
        int[]b=new int[n];
        if(k>=n)
        {
            for(int j=0;j<n;j++)
            {
                b[j]=a[(n-1)-j];
                System.out.print(b[j]);
            }
        }
        else
        {
            for(int j=0;j<n;j++)
            {
                if(k-j<=-1)
                {
                    for(int m=k+1;m<n;m++)
                    {
                        b[j]=a[m];
                        k++;
                        System.out.print(b[j]+" ");
                        break;
                    }
                }
                else
                {
                    b[j]=a[k-j];
                System.out.print(b[j]+" ");
                }
            }
        }
    }
}