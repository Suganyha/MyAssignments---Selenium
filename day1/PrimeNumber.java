package Week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n = 19;
		boolean bPrime = true;
		for (int i = 2; i < n; i++) {
						
		if(n%i==0)	{
			
			System.out.println(n + " is not a Prime Number");
			bPrime = false;
			break;
		}
		}
		if(bPrime=true)
		{
		
			System.out.println(n + " is a  Prime Number");
		}
		}	

	}


