package inheritance;

public class Multi3 extends Multi2 {
	public void fruits3()
	{
		System.out.println("Grape");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi3 a=new Multi3();
		a.fruits1();
		a.fruits2();
		a.fruits3(); 

	}

}
