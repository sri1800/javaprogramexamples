

import java.util.*;

public class ConditionalStatements
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a positive number");
        int N=sc.nextInt();
        if(N%2!=0)
        {
            System.out.println("Weird");
        }
        else
        {
            if(2<=N && N<=5){
                System.out.println("Not Weird");
            }
            if(6<=N && N<=20){
                System.out.println("Weird");
            }
            if(N>20){
                System.out.println("Not Weird");
            }
        }
        sc.close();
    }
}
