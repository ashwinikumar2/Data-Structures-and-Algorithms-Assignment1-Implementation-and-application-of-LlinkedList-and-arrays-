import java.util.Iterator;

public class Student implements Student_ {
	
		public String a1,b1,c1,d1;
		public int completed1;
		public int gradesearned=0;
		public LinkedList<CourseGrade> list=new LinkedList<CourseGrade>();
		
		LinkedList<Integer> list1=new LinkedList<Integer>();//completedcredits
		LinkedList<Integer> list2=new LinkedList<Integer>();//totalcoursesattempted
		Student(String a,String b,String c,String d)
		{
			completed1=0;
			a1=a;
			b1=b;
			c1=c;
			d1=d;
		}
		
		public String name()
		{                                                                                           
			return b1;
		}
		public String entryNo()
		{
		   return a1;
		}
		public String hostel()
		{
			return d1;
		}
		public String department()
		{
			return c1;
		}
		public String completedCredits()
		{
			//int x
			String credits=Integer.toString((list1.count())*3);
			return credits;
		}
		public String cgpa()
		{
			
			double x6=list2.count();
			double cg;
			if(x6!=0)
			{cg=gradesearned/x6;}
			else
			{cg=0;}
			double finalcg=Math.round(cg*100D)/100D;
//			finalcg=finalcg*10;
			String finalcg1=Double.toString(finalcg);//LOOKBACK
			return finalcg1;
		}
		
		public Iterator<CourseGrade_> courseList()
		{
			
			return null;//new Iteratornew<CourseGrade_>(list.head);
		}	
		
}
