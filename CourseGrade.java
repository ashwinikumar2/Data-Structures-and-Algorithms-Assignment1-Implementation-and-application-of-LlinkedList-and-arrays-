
public class CourseGrade implements CourseGrade_ {

	String Coursetitle,Coursenum,g;
	
	
	public CourseGrade(String Coursetitle1,String Coursenum1,String g1)
	{
		g=g1;
		Coursetitle=Coursetitle1;
		Coursenum=Coursenum1;
	}
	
	public String coursetitle() 
	{
		return Coursetitle;
	}

	
	public String coursenum()
	{
		return Coursenum;
	}

	GradeInfo g2=new GradeInfo(g);
	
	public GradeInfo_ grade() 
	{
		return g2;
	}
}
