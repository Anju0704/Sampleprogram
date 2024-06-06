package inheritance;

public class Hierar3 extends Hierar1{
	public void vehicles3()
	{
		System.out.println("Cycle");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierar3 c=new Hierar3();
		c.vehicles1();
		c.vehicles3();

	}

}
