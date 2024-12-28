import java.util.Arrays;
import java.util.Scanner;

class TwoSum_PairwithGivenSum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        System.out.println("Enter"+(n)+" array values ");
        int[]a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();  
        }
        System.out.println(Arrays.toString(a));
        Scanner s=new Scanner(System.in);
        System.out.println("Enter x as target");
        int x=s.nextInt();
        boolean y=false;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]+a[j]==x)
                {
                    y=true;
                }
            }
        }
        if(y)
        {
            System.out.println("true");
        }
        else
            {
                System.out.println("false");
            }
        
    }
}