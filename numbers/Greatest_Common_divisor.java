package numbers;

import java.util.Scanner;

public class Greatest_Common_divisor {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number to find GCD");
        int a = scanner.nextInt();
        System.out.println("Please enter second number to find GCD");
        int b = scanner.nextInt();
        int x=0;
        if(b==0)
        {
        	System.out.println(a);
        }
        else {
        	while(b!=0)
        	{
			x=b;
			b=a%b;
			a=x;
        	}
        	System.out.println(a);
		}
		scanner.close();
	}

}
