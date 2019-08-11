import java.util.Iterator;

public class Courses implements Entity_ {
	
	String name;
	LinkedList<Student> list=new LinkedList<Student>();
	
	public Courses(String name1, LinkedList<Student> list1)
	{
		name=name1;
		list=list1;
	}
	
	public String name() {
		return name;
	}
	
	public Iterator<Student_> studentList() {
		return null;//new Iteratornew<Student_>(list.head);
	}

}
