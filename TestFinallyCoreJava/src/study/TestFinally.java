package study;

public class TestFinally 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("1");
			//throw new ArithmeticException();
			//throw new NullPointerException();
			//System.out.println("2");
		}
		catch (NullPointerException e) 
		{
			System.out.println("3");
		}
		finally
		{
			System.out.println("4");
		}
		System.out.println("5");
	}
}
