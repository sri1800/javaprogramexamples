import java.util.*;
class MissingAndRepeatinginarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        System.out.println("Enter"+(n)+" array values from 1");
        int[]a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();  
        }
        System.out.println(Arrays.toString(a));
        int dup=0;
        int l=a.length;
        for(int i=0;i<l-1;i++)
        {
            for(int j=i+1;j<l-1;j++)
            {
            if(a[i]==a[j])
                {
                    dup=a[i];
                }
            }
        }
        System.out.println("duplicate value is  "+dup);
        int sum=(n*(n+1))/2;
        int sumarr=0;
        
        for(int i=0;i<n;i++)
        {
            sumarr+=a[i]; 
        }
        int mn=sum-(sumarr-dup);
        System.out.println("missing no is "+mn);

    }
}