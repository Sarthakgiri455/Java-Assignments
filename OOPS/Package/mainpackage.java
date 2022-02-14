import primespackage.*;
public class TwinPrimes{	
	public static void main(String[] args)
	{
		for(int i=1;i<10;i++)
	{
		Primes m=new Primes();
		if(m.checkforprime(i)==false)
		{ 
			continue;
		}
		for(int j=i;j<10;j++)
		{
			Primes d= new Primes();
			if(d.checkforprime(j)==true){
				if(j-i==2)
				{
					System.out.println(j+" , "+i);
				}
			}
		}
					
	}
	}
}
	
	
	
	
				
			
		
		
