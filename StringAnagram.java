import java.util.*;
class StringAnagram
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two strings");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        //System.out.println(s1);
        //System.out.println(s2);
        char[]a=s1.toCharArray();
        char[]b=s2.toCharArray();
        //System.out.println(a);
        //System.out.println(b);
        int n=a.length;
        int m=b.length;
        int value=0;
        if(n == m)
        {
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
            }
        }//System.out.println(value);
        int dup = 0; int rep =0;
        for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++)
                {
                if(a[i]==a[j])
                    {
                        dup++;
                    }
                }
            }//System.out.println(dup);
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
            //System.out.println(rep);
        
        
            if((value-rep)==m)
            {
                System.out.println("yes");
            }
        else{
                System.out.println("no");
            }
        
    }
} 