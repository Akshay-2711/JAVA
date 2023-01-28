package tester;

public class t1 
{
	public static void main(String[] args) 
	{
		test(12345);
	}
	
	
	static void test(Integer o)
	{
		System.out.println("in Integer version");
	}
	static void test(double o)
	{
		System.out.println("in double version");
	}
	static void test(int... o)
	{
		System.out.println("in int... version");
	}
}