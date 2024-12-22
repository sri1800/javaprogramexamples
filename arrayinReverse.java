import java.util.Arrays;
import java.util.Scanner;

class arrayinReverse
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
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(a[i]+ " ");
        }
    }
}