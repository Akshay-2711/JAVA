package code;

public class Agecheck
{
	private static final int MAX_AGE;
	private static final int MIN_AGE;
	static
	{
		MAX_AGE=75;
		MIN_AGE=18;
		
	}
	public static void ageChecker(int age) throws AgeOutOfLimitException
	{
		if(age<MIN_AGE)
			throw new AgeOutOfLimitException("Sorry!! Your age is not valid");
		
		if(age>MAX_AGE)
			throw new AgeOutOfLimitException("Sorry your age is above the limit!!");
		
		System.out.println("Age within limit!!");
	}
	
	
	
}
