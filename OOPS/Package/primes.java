
package primespackage;
public class Primes{
	
	public boolean checkforprime(int n)
	{
		if((n==1))
		{
			return false;
		}
		for(int j=2;j<n;j++)
		{
			if((n%j)==0)
			{
				return false;
			}
		}
		return true;
	}
}

		
