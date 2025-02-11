package arrays1;
import java.util.*;
class UnionofArrayswithDuplicates
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
        int value=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                    if(a[i]==b[j])
                    {
                        System.out.println(a[i]);
                        value++;
                    }
                
            }
        }
        int total=((n+m)-value);
        System.out.println("union array has "+total+" values");
    }
}


        