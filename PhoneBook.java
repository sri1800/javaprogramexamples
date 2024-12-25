import java.util.*;
import java.io.*;

class PhoneBook
{
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> pb=new HashMap<String,Integer>();
        for(int i = 0; i < n; i++)
        {
            String name = in.next();
            int phone = in.nextInt();
            pb.put(name,phone);
            
        }
        while(in.hasNext())
        {
            String s = in.next();
            if(pb.containsKey(s))
            {
                System.out.println(s+"="+pb.get(s));
            }
            else
            {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}