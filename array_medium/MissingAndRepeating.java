package array_medium;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList; 
import java.util.Stack;

import strings_medium.Solution;

public class MissingAndRepeating
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

          
            ArrayList<Integer> ans = new Solution().findTwoElement(arr);
            System.out.println(ans.get(0) + " " + ans.get(1));
            System.out.println("~");
        }
    }
}


class Solution {
   
    ArrayList<Integer> findTwoElement(int arr[]) 
    {
        ArrayList<Integer> result = new ArrayList<>();
        int n= arr.length;
        int sum=(n*(n+1))/2;
        int as=0;
        int a=0;
        int b=0;
        for(int i=0;i<n;i++)
        {
            as=as+arr[i];
            for(int j=1+i;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                   a=arr[i]; 
                   break;
                }
            }
        }
        as=as-a;
        b=sum-as;
        result.add(a);
        result.add(b);
        return result;
        
    }
}
