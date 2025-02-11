package string;

import java.util.HashMap;
import java.util.Scanner;

public class occurrence_ofeachword {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String x=sc.nextLine();
        HashMap<String,Integer> hm=new HashMap<String, Integer>();
		for(String s:x.split(" ")) 
		{
			if(hm.containsKey(s)) 
			{
				hm.put(s,hm.get(s)+1);
			}
			else 
			{
				hm.put(s,1);
			}
		}
		System.out.println(hm);

	}

}
