package array_basic;

import java.util.Arrays;
import java.util.Scanner;

public class common_in2arrays {

	public static void main(String[] args) 
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+i+" element in array");
			 a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));*/
		
		int[]a= {1,2,3,4};
		int[]b= {2,4,6,8};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}

}
