package array;

public class sum_number_only {

	public static void main(String[] args) 
	{
		String[]a= {"1","a","5","d","8","e","9"};
		int n=a.length;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			try {
				int x=Integer.parseInt(a[i]);
				sum=sum+x;
			}
			catch (Exception e) {

			}
		}
		System.out.println(sum);
	}

}
