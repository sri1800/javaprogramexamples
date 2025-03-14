
import java.util.Scanner;

class countdigits_divide_n
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int N=sc.nextInt();
        int count=0;
        int n=N;
        while(n>0)
        {
            int digit=n%10;
            if(digit!=0 && N%digit==0)
            {
                count++;
            }
            n/=10;
        }
        System.out.println(count);
        sc.close();
    }
}