
class fibanoci_recursion
{
    public static int fibanocci(int n) 
    {
        if(n<=1)
        {
            return n;
        }
        return fibanocci(n-1)+fibanocci(n-2);
    }
    public static void main (String args[])
    {
        int terms=10;
        System.out.println("Fibanoci series of first "+terms);
        for(int i=0;i<terms;i++)
        {
            System.out.print(fibanocci(i)+" ");
        }
    }

}
            