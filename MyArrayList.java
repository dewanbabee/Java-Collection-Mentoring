package collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;


public class MyArrayList<T> {
	private ArrayList<T>  myArrayList; //not accessible from outside 
	private int classSize;            //gives you the total no of Students
	
	/* Default Constructor creates an empty ArrayList */
	public MyArrayList()   
	{
		this.myArrayList =new ArrayList<T>();
	}
	
	//This method takes another ArrayList and append to the exsisting Arraylist of the class 
	public void addArrayList(ArrayList<T> obj)
	{
		
		this.myArrayList.addAll(obj);
		
		
	}
	
	public int getClassSize()
	{
		return classSize = myArrayList.size() ;
	}
	
	// Add one object
	public void addMember(T obj)
	{
		myArrayList.add(obj);
	}
	
	//Add an arry of students to the existing list
	public void addArray(T[] obj)  //add an array of T type to exsisting list 
	{
		// List<T> list = Arrays.asList(obj); convert arry to List
		Collections.addAll(this.myArrayList, obj);
	}
	
	public void showAll()  //iterate
	{
		ListIterator<T> lr = myArrayList.listIterator(); 
		while(lr.hasNext())
			System.out.println(lr.next().toString());
//		for(T li: myArrayList)
//			li.toString();
	}

}
