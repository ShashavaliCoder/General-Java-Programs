import java.util.*;
public class CheckPrime {

	public static void main(String[] args) {
		 
		int n = new Scanner(System.in).nextInt();
		if(isPrime(n))
		{
			System.out.println(n + " is Prime Number");
		}
		else 
		{
			System.out.println("Not a Prime Number");
		}
	}
	static boolean isPrime(int n)
	{
		// Number Less than 2 are'nt Prime Number
		if(n<2)
		{
			return false;
		}
		// check for Divisibilty from 2 to square root of number
		for(int i=2;i<=Math.sqrt(n);i++)  // (or i*i<=n)
		{
			if(n%i==0)
			{
				return false; // If Divisble by any, It's Not Prime
			}
		}
		return true; // If No Divisors found, It's Prime
		
	}
}
