package array_medium;
class duplicatearrayelements
{
    public static void main(String args[])
    {
        int[]a={1,5,8,6,4,1,8,4};
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
            if(a[i]==a[j])
                {
                    System.out.println(a[i]);
                }
            }
        }
    }
}