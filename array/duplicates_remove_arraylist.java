package array;

import java.util.ArrayList;
import java.util.HashSet;

public class duplicates_remove_arraylist {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(2);
		al.add(1);
		al.add(3);

		HashSet<Integer> x=new HashSet<Integer>(al);
		System.out.println(x);
	}

}
