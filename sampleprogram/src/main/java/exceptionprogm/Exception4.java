package exceptionprogm;

public class Exception4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="paper";
		try
		{
			int b=Integer.parseInt(a);
			System.out.println(b);
		}
		catch(NumberFormatException c)
		{
			System.out.println("String cannot be converted to integer");
		}

	}

}
