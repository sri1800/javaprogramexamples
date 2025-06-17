package array_medium;
class arrayleader
{
    public static void main(String args[])
    {
        int[]a={1,5,8,6,4,1,8,4};
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {   
            if(a[i]>=a[i+1])
                {
                    System.out.println(a[i]);
                }
            
        }
    }
}