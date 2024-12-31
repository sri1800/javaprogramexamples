import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class StringtoInteger
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        bufferedReader.close();
        try
        {
            int x=Integer.parseInt(S);
            System.out.println(x);
        }
        catch(Exception e)
        {
            System.out.println("Bad String");
        }
    }
}
