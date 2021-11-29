package problem5;

public class Prime 
{
	public boolean isPrime(int val)
	{
		if(val<2)
			return false;
		for(int i = 2; i<=val/2; i++)
		{
			if(val%i==0)
				return false;
		}
		return true;
	}
}
