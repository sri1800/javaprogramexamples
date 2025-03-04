package array_basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import string_basic.aabbcccdd_convert_to_a2b2c3d2;

public class non_repeated_inarray {

	public static void main(String[] args) 
	{
		int[]a= {5,2,6,1,4,5,6,7,2,8,4,9};
		int n=a.length;
		HashMap<Integer,Integer>x=new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++)
		{
			if(x.containsKey(a[i]))
			{
				x.put(a[i],x.get(a[i])+1);
			}
			else {
				x.put(a[i],1);
			}
		}
		ArrayList<Integer>A=new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer>y:x.entrySet())
		{
			if(y.getValue()==1)
			{
				A.add(y.getKey());
			}
		}
		System.out.println(A);
	}

}
