import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result 
{

    public static void miniMaxSum(List<Integer> arr) 
    {

        Collections.sort(arr);
        long min=0;
        long max=0;
        for(int i=0;i<arr.size()-1;i++)
        {
            min+=arr.get(i);
        }
        for(int i=1;i<arr.size();i++)
        {
            max+=arr.get(i);
        }
        System.out.println(min+" "+max);
    }

}

public class Min_Max_Sum 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
