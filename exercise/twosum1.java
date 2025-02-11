package exercise;
import java.util.*;
class twosum1
{
	public static int[] twosum(int n,int []num,int target)
	{
		int ans[]=new int[2];
		ans[0]=-1;
		ans[1]=-1;
		HashMap<Integer,Integer> H=new HashMap<>();
		for(int i=0;i<n;i++)
		{
		int a=num[i];
		int more=target-a;
		if(H.containsKey(more))
		{
			ans[0]=H.get(more);
			ans[1]=i;
			return ans;
		}
		H.put(num[i],i);
		}
		return ans;
	}
	
	public static void main (String args[])
	{
	int n=5;
	int []num={2,5,8,6,11};
	int target=14;
	int []ans=twosum(n,num,target);
	System.out.println(ans[0]+","+ans[1]);
	}
}
