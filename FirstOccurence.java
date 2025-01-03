import java.util.*;

class FirstOccurence 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String line = sc.nextLine();
            String a = line.split(" ")[0];
            line = sc.nextLine();
            String b = line.split(" ")[0];

            Solution g = new Solution();
            System.out.println(g.firstOccurence(a, b));

            t--;

            System.out.println("~");
        }
    }
}
class Solution 
{
    int firstOccurence(String txt, String pat) 
    {
        int n=txt.length();
        int m=pat.length();
        for(int i=0;i<n;i++)
        {
            int j;
            for( j=0;j<m;j++)
                {
                    if(pat.charAt(j)!=txt.charAt(i+j))
                    {
                        break;
                    }
                }
                if(j==m)
                {
                    return i;
                }
        }
            return -1;
    }
}
