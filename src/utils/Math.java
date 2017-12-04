package utils;

public class Math {
	public static long factorial(int n)
	{    
		long result = n ;
		if (n < 2)
			return result;
	 return	result = result*factorial(n-1);
	}
	
	public static long factorialLoop(int n)
	{
		long result = 1;
		for (int i = n; i>0;i--)
			result = result *i;
		return result;
		
	}

}
