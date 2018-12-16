package collection;

import java.util.ArrayList;

public class TestCollection {

	public static void main(String[] args) {
		Student st1 = new Student("Paul",98);
		Student st2 =  new Student("Lima",100);
		Faculty ft1 = new Faculty("David",231);
		Faculty ft2 =  new Faculty("Brown",454);
		MyArrayList<Student> stList1 = new MyArrayList<Student>();
		
		ArrayList<Faculty> ftList = new ArrayList<Faculty>();
		ftList.add(ft1);
		ftList.add(ft2);
		
		for(Faculty f:ftList)
        System.out.println(f.toString());
		
		stList1.addMember(st1);
		stList1.addMember(st2);
		
		//for(Student s:stList)
		stList1.showAll();
		System.out.println("After Adding additional Student to student list");
		Student[] stList2 = {new Student("Liza",92), new Student("Kristen",75)};
		stList1.addArray(stList2);
		stList1.showAll();
		System.out.println("Total no of students is : "+stList1.getClassSize());
		
		
			
		
		

	}

}
