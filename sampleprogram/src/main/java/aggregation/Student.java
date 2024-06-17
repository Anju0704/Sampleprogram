package aggregation;

public class Student {
	String name;
	int rank;
	Details add;

	public Student(String name,int rank,Details add)
	{
	this.name=name;
	this.rank=rank;
	this.add=add;
	}
	
	public void display()
	{
		System.out.println(name+" "+rank);
		System.out.println(add.city+" "+add.pincode);
	}
	public static void main(String args[])
	{
		Details a =new Details(695001,"Kollam");
		Student b=new Student("anju",2,a);
		b.display();
		
		
	}
	}
 