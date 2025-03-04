package array_medium;
import java.util.*;
class ArraySubset
{
    public static void main(String args[])
    {
        int []a={2,5,6,4,5,7,6,9,10};
        int n=a.length;
        Arrays.sort(a);
        System.out.println("a "+Arrays.toString(a));
        int []b={5,6,4,2,5,6};
        int m=b.length;
        Arrays.sort(b);
        System.out.println("b "+Arrays.toString(b));
        int value=0;
        if(m<=n)
        {
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(b[i]==a[j])
                    {
                        value++;
                    }
                
                }
            }System.out.println(value);
            int dup = 0; int rep =0;
        for(int i=0;i<n;i++)
            {
            for(int j=i+1;j<n;j++)
                {
                if(a[i]==a[j])
                    {
                        dup++;
                    }
                }
            }System.out.println(dup);
            if(dup==1)
            {
                rep=2;
            }
            else if(dup==2)
            {
                rep=4;
            }
            else
            {
                rep = dup * (dup-1);
            }
            System.out.println(rep);
            if((value-rep)==m)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
        else
        {
            System.out.println("b size should always be less than or equal to A size");
        }
    }
}
