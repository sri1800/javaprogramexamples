package arrays1;
import java.util.*;
class EquilibriumPoint
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter"+i+ "th value of the array");
               a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        int sumf=0;
        int suml=0;
        boolean temp=false;
        int index=0;
        for(int j=1;j<=n-2;j++)
        {
            sumf=0;
            suml=0;
            for(int k=0;k<j;k++)
            {
            sumf+=a[k];
            System.out.println(sumf);
            }
            for(int l=j+1;l<n;l++)
            {
            suml+=a[l];
            System.out.println(suml);
            }

           if(sumf==suml)
           {
            index=j;
            temp=true;
            //System.out.println("yes");
           }
        }
        if (temp)
        {
            System.out.println("Equlibrium index point"+index+" is index value is  "+temp);
        }
        else
        System.out.println("-1");
    }
}