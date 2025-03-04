package array_medium;
import java.util.*;
class CheckEqualArrays
{
    public static void main(String args[])
    {
        int []a={2,4,5,5,6};
        int n=a.length;
        Arrays.sort(a);
        System.out.println("a "+Arrays.toString(a));
        int []b={2,4,5,5,6};
        int m=b.length;
        Arrays.sort(b);
        System.out.println("b "+Arrays.toString(b));
        int value=0;
        if(n == m){
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(a[i]==b[j])
                    {
                        //System.out.println(a[i]);
                        //System.out.println(b[j]);
                        value++;
                    }
                
                }
            }System.out.println(value);}
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
            else
            {
                rep = dup * (dup-1);
            }
            System.out.println(rep);
        
        
            if((value-rep)==m)
            {
                System.out.println("yes");
            }
        else{
                System.out.println("no");
            }
    }
}
