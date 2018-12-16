package collection;

public class Student {
	public String name;
	public int marks;
	
	public Student(String name, int marks)
	{
		this.name = name;
		this.marks = marks;
				
	}
public void getInfo()
{
	System.out.println(this.toString());
}

public String toString()
{
	return this.name + " got "+ this.marks;
}
}
