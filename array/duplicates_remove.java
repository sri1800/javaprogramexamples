package array;

import java.util.HashSet;
import java.util.Set;

public class duplicates_remove {

	public static void main(String[] args) 
	{
		 int[]a={1,5,8,6,4,1,8,4};
	        int n=a.length;
	        HashSet<Integer> s=new HashSet<Integer>();
	        for(int i=0;i<n;i++)
	        {
	           s.add(a[i]);
	        }
	        System.out.println(s);

	}

}
