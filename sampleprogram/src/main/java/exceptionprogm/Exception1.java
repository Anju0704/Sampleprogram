package exceptionprogm;

public class Exception1 {
	
	
	public static void main(String args[])
	{
		try
		{
		int a=10;
		int b=0;
		int c=a/b;
		//System.out.println("haiiii");
		System.out.println(c);
		}
		/*catch(ArithmeticException a)
		{
			System.out.println("Exception occured");
		}*/
		finally
		{
			System.out.println("Completed");
		}
	}

}
