package array;

import java.util.ArrayList;

public class first_last_inarraylist {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("sri");
		al.add("hari");
		al.add("uday");
		al.add("ganesh");
		al.add("swamy");
		
		String f=al.get(0);
		String l=al.get(al.size()-1);
		System.out.println(f);
		System.out.println(l);
	}

}
