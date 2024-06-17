package exceptionprogm;

public class Customexpection {
	public void display(int age) throws VotingException
	{
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			throw new VotingException("Invalid age");
		}
	}
	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
		Customexpection a=new Customexpection();
	
		a.display(10);

	}

}
