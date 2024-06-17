package throwprograms;

public class Throw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15;
		if(a>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			throw new ArithmeticException("Invalid age");
		}

	}

}
