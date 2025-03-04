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

class Result {

    public static void plusMinus(List<Integer> arr) {
        int x=arr.size();
        int p=0;
        int n=0;
        int z=0;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)>0)
            {
                p++;
            }
            else if(arr.get(i)==0)
            {
                z++;
            }
            else if(arr.get(i)<0){
                n++;
            }
        }
        double A=(double)p/x;
        double B=(double)n/x;
        double C=(double)z/x;
        
        System.out.println(String.format("%.6f",A));
        System.out.println(String.format("%.6f",B));
        System.out.println(String.format("%.6f",C));
    }
    

}

public class fraction_values 
{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
