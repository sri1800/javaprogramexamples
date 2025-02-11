package exercise;
import java.util.*;
class twosum2
{
	public static String twosum(int n,int []num,int target)
	{
		Arrays.sort(num);
		int left=0,right=n-1;
		
		while (left<right){
		int sum=num[left]+num[right];
		if (sum==target)
		{
		return "yes";
		}else if (sum<target) left++;
		else right--;
		}
		return "no";
	}
	
	public static void main (String args[])
	{
	int n=5;
	int []num={2,5,8,6,11};
	int target=14;
	String ans=twosum(n,num,target);
	System.out.println(ans);
	}
}
