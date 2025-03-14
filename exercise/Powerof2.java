
import java.util.*;
class Powerof2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        while(n>0)
        {
            if(n==1)
            { System.out.println("yes");break;}

                else if (n%2==0)
            {
                n/=2;
                if(n==1)
                {
                    System.out.println("yes");
                }
            }else { System.out.println("no"); break;}
        }
        sc.close();
        }  
    }
