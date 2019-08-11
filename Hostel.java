import java.util.Iterator;

public class Hostel implements Entity_ {
	
	String name;
	LinkedList<Student_> list=new LinkedList<Student_>();
	
	public Hostel(String name1, LinkedList<Student_> list1)
	{
		name=name1;
		list=list1;
	}
	
	public String name()                 
	{
		return name;
	}
	public Iterator<Student_> studentList()
	{
		return new Iteratornew<Student_>(list.head);
	}
}
