package exercise;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference 
{
  	private int[] elements;
  	public int maximumDifference;

    public Difference(int[]arr)
    {
        elements=arr;
    }
    public int computeDifference()
    {
        Arrays.sort(elements);
        System.out.println(Arrays.toString(elements));
        int dif=elements[elements.length-1]-elements[0];
        return maximumDifference=dif;
    }
}

public class Scope
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();
        System.out.println("Enter"+(n)+" array values");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}