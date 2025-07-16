import java.util.*;
class PrimeCheck 
{
     static Scanner sc = new Scanner(System.in);
    public static boolean isPrime(int n) 
	{
        	if (n <= 1) 
		    {
            		return false; // 0, 1, and negative numbers are not prime
        	}
        	for (int i = 2; i * i <= n; i++)
		    {
            		if (n % i == 0) 
			        {
                		return false; // If divisible, it's not prime
            		}
        	}
        	return true; // If no divisors, it's prime
    	}

    public static void main(String[] args) 
	{
	       	int number = sc.nextInt();
        	if (isPrime(number)) 	
		    {
            		System.out.println(number + " is a prime number.");
        	} 
		    else 
		    {
            		System.out.println(number + " is not a prime number.");
        	}
    }
}