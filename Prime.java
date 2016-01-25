public class Prime
{
	public static int nthPrime(int n)
	{
		int[] primes = new int[n];
		primes[0] = 2;
		int currentNum = 3;
		int counter = 1;
		while(counter < primes.length)
		{
			if(isPrime(currentNum) == true)
			{
				primes[counter] = currentNum;
				counter++;
			}
			currentNum++;
		}
		return primes[primes.length-1];
	}
	public static boolean isPrime(int n)
	{
		for(int i = 2; i*i<=n; i++)
		{
			if((n%i) == 0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		System.out.println(nthPrime(10001));
	}
}