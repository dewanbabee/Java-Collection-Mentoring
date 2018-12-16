package collection;

public class Faculty {
	public String name;
	public int courseNo;
	
	public Faculty(String name, int courseNo)
	{
		this.name = name;
		this.courseNo = courseNo;
				
	}
public void getInfo()
{
	System.out.println(this.toString());
}

public String toString()
{
	return this.name + " takes "+ this.courseNo;
}
}