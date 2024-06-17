 package accessmodifier;

public class Access1 {
	public void display1()
	{
		System.out.println("Public access specifier");
	}
	private void display2() 
	{
		System.out.println("Private access specifier");
	}
	protected void display3()
	{
		System.out.println("Protected access specifier");
	}
	void display4()
	{
		System.out.println("Default access specifer");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1 a=new Access1();
		
		a.display1();
		a.display2();
		a.display3();
		a.display4();
				
		

	}

}
