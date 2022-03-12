package study;

public class TestFinally2 
{
	public static void main(String[] args) {


		try
		{
			System.out.println("1");
			//throw new ArithmeticException();
			throw new NullPointerException();
			//System.out.println("2");
		}

		finally
		{
			System.out.println("4");
		}
	}
}