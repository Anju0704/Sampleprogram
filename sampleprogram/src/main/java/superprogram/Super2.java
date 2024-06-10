package superprogram;

public class Super2 extends Super1{
	String name="orange";
	public void display()
	{
		System.out.println(name);
		System.out.println(super.name);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super2 a=new Super2();
		a.display();
		

	}

}
