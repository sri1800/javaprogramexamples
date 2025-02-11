package arrays1;
import java.util.*;
class Commonin3SortedArrays
{
    public static void main(String args[])
    {
        int []a={1,5,6,4};
        int n=a.length;
        Arrays.sort(a);
        System.out.println("a "+Arrays.toString(a));
        int []b={5,8,9,4};
        int m=b.length;
        Arrays.sort(b);
        System.out.println("b "+Arrays.toString(b));
        int[]c={2,3,5,4};
        int o=c.length;
        Arrays.sort(c);
        System.out.println("c "+Arrays.toString(c));
        int value=0;
        while(1>0)
        {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                for(int k=0;k<o;k++)
                {
                    if((a[i]==b[j])&&(b[j]==c[k]))
                    {
                        System.out.println(a[i]); 
                        value=1;
                    }
                }
            }
        }
        if(value==0)
        {
            System.out.println("-1"); 
            break;
        }
        else
        {
            break;
        }
        }

    }
}


        