import java.util.Scanner;
import java.util.Arrays;

class consecutive_1s_inbinaryrepresentation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        String a="";
        while(n>0)
        {
        a=n%2+a;
        n=n/2;
        }
        System.out.println(a);
        char[] array = a.toCharArray();
        int maxCount = 1;
        for(int i = 0;i < a.length() - 1; i++)
        {
            for(int j=0;j<a.length() - 1;j++)
            {
            int count = 1;
            while (++j < a.length() && array[i] == array[j]) 
            {
                count++;
            }
            if (count > maxCount) 
            {
                maxCount = count;
            }
            }
        }
        System.out.println(maxCount);
    }
    
}
