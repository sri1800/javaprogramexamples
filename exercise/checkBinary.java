
import java.util.*;

class checkBinary 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T > 0) {
            String str = sc.nextLine();
            Solution g = new Solution();
            boolean b = g.isBinary(str);
            if (b == true)
                System.out.println("true");
            else
                System.out.println("false");
            T--;

            System.out.println("~");
        }
        sc.close();
    }
}
class Solution {
    boolean isBinary(String s) {
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!='0' && s.charAt(i)!='1')
            {
                return false;
            }
        }
        return true;
    }
}