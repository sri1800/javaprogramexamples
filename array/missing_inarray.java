package array;

public class missing_inarray {

	public static void main(String[] args) 
	{
		int[]a={1,2,4,5,6};
        int n=a.length+1;
        int s=(n*(n+1))/2;
        int as=0;
        for(int i=0;i<n-1;i++)
        {
        	as=as+a[i];
        }
        int x=s-as;
        System.out.println(x);
	}

}
