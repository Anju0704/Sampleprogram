package inheritance;

public class Hierar2 extends Hierar1
{
	public void vehicles2()
	{
		System.out.println("car");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierar2 b=new Hierar2();
		b.vehicles1();
		b.vehicles2();

	}

}
