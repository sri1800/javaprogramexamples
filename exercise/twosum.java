
import java.util.*;

public class twosum 
{
    public static int[] twoSum(int []a, int target) 
    {
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = i + 1; j < a.length; j++) 
            {
                if (a[i] + a[j] == target) 
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String args[]) 
    {
        
        Scanner s =new Scanner(System.in);
        int n;

        /* Iterative loop to ask for user input */
        do{
        System.out.println("Enter atleast size of array as > 2");
        n=s.nextInt();
        }while(n<2);

        /* Dynamic loading of single dimension array */
        int a[]=new int[n];
        System.out.println("enter "+n+ " array values");
        for(int i=0;i<n;i++)
        {
            a[i]= s.nextInt();   
        }

        /* function call for twosum  */
        System.out.println("enter target value:  ");
        int target=s.nextInt();
        int[] ans = twoSum(a, target);
        
        /* function returns array of indices for possible sum and empty array for not possible sum */
        if (ans.length==0){
            System.out.println("Target not possible as sum");
        } 
        else{
            System.out.println( "Sum of values in returned indices "+ ans[0] +","+ ans[1]+" will give " + target);
        }
        s.close();
    }
}