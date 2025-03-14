public class PrimeSum 
{

	public static void main(String[] args) 
    {
		System.out.println("Result: " + primesum(20));
	}

	static long primesum(int maxNum) 
    {
		int sum = 0, num;
		//insert your code here
		if (maxNum <= 1) 
        {
            return 0;
        }

        for (num = 2; num <= maxNum; num++) 
        {
            if (isPrime(num)) 
            {
                sum += num;
            }
        }
        return sum;
    }

    static boolean isPrime(int n) 
    {
        for (int i = 2; i < n; i++) 
        { 
            if (n % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
}

