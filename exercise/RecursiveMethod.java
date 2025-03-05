
import java.util.*;
class Result 
{
    public static int factorial(int n)
    {
 
            if(n<=1)
            {
                return 1;
            }
            else
            {
            return n * factorial(n-1);
            }
    }

}
public class RecursiveMethod
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value to get factorial value of n");
        int n=sc.nextInt();
        int result = Result.factorial(n);

        System.out.println(String.valueOf(result));
        sc.close();
    }
}
