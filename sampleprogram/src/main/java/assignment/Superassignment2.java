package assignment;

public class Superassignment2 extends Superassignment1{
	
	public void display()
	{
int e=super.add();
if(e%10==0) {
	System.out.println("Divisible by 10");
}
else
{
	System.out.println("not divisible by 10");
}
	}
	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Superassignment2 d=new Superassignment2();
		d.display();
	}
}
	


