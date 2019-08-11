import java.io.*;
import java.util.Iterator;


public class Assignment1
{	

	static LinkedList<Hostel> allHostels=new LinkedList<Hostel>();			
	static LinkedList<Courses> allCourses=new LinkedList<Courses>();
	static LinkedList<Department> allDepartments=new LinkedList<Department>();
	static LinkedList<Student> Students=new LinkedList<Student>();
    static LinkedList<Student_> Students1=new LinkedList<Student_>();
    static LinkedList<CoursesWithTitle> CoursesListTitle =new LinkedList<CoursesWithTitle>();
    
    private static void getData(String studentfilename, String coursesfilename) throws IOException
    {
    	FileReader fr=new FileReader(studentfilename);
		BufferedReader br=new BufferedReader(fr);
		while(br.ready())
		{
			String str=br.readLine();
			String [] words=str.split(" ");
				Student ash=new Student(words[0],words[1],words[2],words[3]);
				Students.add(ash);
				if(allHostels.count()!=0)
				{					
						String s1=ash.hostel();
						String s3=allHostels.head.value().name();
						
						int x=allHostels.count();
						if(x!=1) 
						{	
							String s2= allHostels.positions().next().value().name();
							
							if(s1.equals(s2))
							{
								allHostels.positions().next().value().list.add(ash);
							}
						
							else 
							{
								String s4=allHostels.head.value().name();
								
								if(s4.equals(s1))
								{
									allHostels.head.value().list.add(ash);
//									break;
								}
								else
								{
									int y=0;
									
									Iterator<Position_<Hostel>> itr1 = allHostels.positions();
									
									while(itr1.hasNext()) 
									{
										Hostel h1 = itr1.next().value();
										if (s1.equals(h1.name())) 
										{
											h1.list.add(ash);
											y++;
										}
									}
									if (y==0)
									{
										LinkedList<Student_> l1=new LinkedList<Student_>();
										l1.add(ash);
										Hostel h = new Hostel(ash.hostel(), l1);
										allHostels.add(h);
										
									}
								}
							}
						}
						else 
						{	
							if(s1.equals(s3))
							{
								allHostels.head.value().list.add(ash);

							}
							else 
							{
								LinkedList<Student_> list2=new LinkedList<Student_>();
								list2.add(ash);
								Hostel h=new Hostel(ash.hostel(), list2);
								allHostels.add(h);
							}
						}
					
				}
				
				else
				{
					LinkedList<Student_> list2=new LinkedList<Student_>();
					list2.add(ash);
					Hostel h=new Hostel(ash.hostel(), list2);
					allHostels.add(h);
					
				}
			
		}
		fr.close();

		
		FileReader fr1=new FileReader(studentfilename);
		BufferedReader br1=new BufferedReader(fr1);
		while(br1.ready())
		{
			String str1=br1.readLine();
			String [] words1=str1.split(" ");
			
				Student ash1=new Student(words1[0],words1[1],words1[2],words1[3]);
				Students1.add(ash1);
				if(allDepartments.count()!=0)
				{
						String s11=ash1.department();
						String s31=allDepartments.head.value().name();
						
						int x1=allDepartments.count();
						if(x1!=1) 
						{	
							String s21= allDepartments.positions().next().value().name();
							
							if(s11.equals(s21))
							{
								allDepartments.positions().next().value().list.add(ash1);
							}
						
							else 
							{
								String s41=allDepartments.head.value().name();
								
								if(s41.equals(s11))
								{
									allDepartments.head.value().list.add(ash1);
								}
								else
								{
									int y1=0;
									
									Iterator<Position_<Department>> itr11 = allDepartments.positions();
									
									while(itr11.hasNext()) 
									{
										Department h11 = itr11.next().value();
										if (s11.equals(h11.name())) 
										{
											h11.list.add(ash1);
											y1++;
										}
									}
									if (y1==0)
									{
										LinkedList<Student_> l11=new LinkedList<Student_>();
										l11.add(ash1);
										Department h1 = new Department(ash1.department(), l11);
										allDepartments.add(h1);
										
									}
								}
							}
						}
						else 
						{	
							if(s11.equals(s31))
							{
								allDepartments.head.value().list.add(ash1);
							}
							else 
							{
								LinkedList<Student_> list21=new LinkedList<Student_>();
								list21.add(ash1);
								Department h1=new Department(ash1.department(), list21);
								allDepartments.add(h1);
							}
						}
					
				}
				
				else
				{
					LinkedList<Student_> list21=new LinkedList<Student_>();
					list21.add(ash1);
					Department h1=new Department(ash1.department(), list21);
					allDepartments.add(h1);
					
				}
		}
		
		fr1.close();

		FileReader fr4=new FileReader(coursesfilename);
		BufferedReader br4=new BufferedReader(fr4);
		while(br4.ready())
		{
			String str4=br4.readLine();
			String [] words111=str4.split(" ",4);
			
			String s13=words111[0];//entryNo
			String s14=words111[1];//coursenum
			String s15=words111[2];//coursegrade
			String s16=words111[3];//coursetitle
			String s17=Students.head.value().entryNo();
			
			if(s17.equals(s13))
			{
				CourseGrade c3=new CourseGrade(s16,s14, s15);
				Students.head.value().list.add(c3);
				if(s15.equals("A")||s15.equals("Aminus")||s15.equals("B")||s15.equals("Bminus")||s15.equals("C")||s15.equals("Cminus")||s15.equals("D"))
				{
					Student o=(Student) Students.head.value();
					int gradeo=0;
					if (s15.equals("A"))
						gradeo=10;

					else if (s15.equals("Aminus")) 
						gradeo= 9;

					else if (s15.equals("B")) 
						gradeo=8;

					else if (s15.equals("Bminus")) 
						gradeo= 7;

					else if (s15.equals("C")) 
						gradeo=6;

					else if (s15.equals("Cminus")) 
						gradeo=5;

					else if (s15.equals("D")) 
						gradeo= 4;
					
					o.gradesearned +=gradeo;
					o.list1.add(1);
					o.list2.add(1);
				}
				else if(s15.equals("E")||s15.equals("F"))
				{	
					Student o=(Student) Students.head.value();
					o.list2.add(1);
				}
				
			}
			else
			{
				LinkedListIterator<Student> it3=new LinkedListIterator<Student>(Students.head);
				while(it3.hasNext())
				{
					Student o=(Student) it3.next().value();
					String s18=o.entryNo();
					if(s18.equals(s13))
					{
						CourseGrade c3=new CourseGrade(s16,s14, s15);
						o.list.add(c3);
						if(s15.equals("A")||s15.equals("Aminus")||s15.equals("B")||s15.equals("Bminus")||s15.equals("C")||s15.equals("Cminus")||s15.equals("D"))
						{	
							int gradeo=0;
							if (s15.equals("A"))
								gradeo=10;

							else if (s15.equals("Aminus")) 
								gradeo= 9;

							else if (s15.equals("B")) 
								gradeo=8;

							else if (s15.equals("Bminus")) 
								gradeo= 7;

							else if (s15.equals("C")) 
								gradeo=6;

							else if (s15.equals("Cminus")) 
								gradeo=5;

							else if (s15.equals("D")) 
								gradeo= 4;
							
							o.gradesearned +=gradeo;
							o.list1.add(1);
							o.list2.add(1);
						}
						else if(s15.equals("E")||s15.equals("F"))
						{
							o.list2.add(1);
						}
						
					}
				}
				
				
			}
		}
		
		
		FileReader fr22 = new FileReader(coursesfilename); 
	    BufferedReader br22 = new BufferedReader(fr22);
	    while(br22.ready())
	    {
	    	String str22=br22.readLine();
	    	String[] words22=str22.split(" ",4);
	    	Iterator<Position_<Courses>> it311 = allCourses.positions();
    	if(allCourses.count() != 0)
    	{
    		
    		int count2=0;
    		Courses obj5 = allCourses.head.value();
    		if(obj5.name().equals(words22[1]))
    		{
    			
    			count2++;
    			Iterator<Position_<Student>> it4 = Students.positions();
    			if(Students.head.value().entryNo().equals(words22[0]))
    			{
    				Student obj7 = Students.head.value();
    				obj5.list.add(obj7);
    				
    			}
    			else {
    				while(it4.hasNext())
    				{
    					Student obj7 = it4.next().value();
    					if(obj7.entryNo().equals(words22[0]))
    					{
    						obj5.list.add(obj7);
    						break;
    					}
    				}
    			}
     		}
    		else {
    			if(allCourses.count() == 1)
    			{
    				
    				LinkedList<Student> list = new LinkedList<Student>();
    				Iterator<Position_<Student>> it4 = Students.positions();
	    			if(Students.head.value().entryNo().equals(words22[0]))
	    			{
	    				Student obj7 = Students.head.value();
	    				list.add(obj7);
	    			}
	    		
	    			else {
	    				
	    				while(it4.hasNext())
	    				{
	    					
	    					Student obj7 = it4.next().value();
	    					if(obj7.entryNo().equals(words22[0]))
	    					{
	    						list.add(obj7);
	    						break;
	    					}
	    				}
	    				}
	    			
	    			Courses oo = new Courses(words22[1], list);
	    			allCourses.add(oo);
    				
    			}
    			int count = 0;
    			while(it311.hasNext() && allCourses.count() != 1)
    			{
    				Courses obj51 = it311.next().value();
    				if(obj51.name().equals(words22[1]))
    				{
    					count++;
    					Iterator<Position_<Student>> it4 = Students.positions();
    					if(Students.head.value().entryNo().equals(words22[0]))
    					{
    						Student obj7 = Students.head.value();
    						obj51.list.add(obj7);
    					}
	    		
	    			else {
	    				
	    				while(it4.hasNext())
	    				{
	    					
	    					Student obj7 = it4.next().value();
	    					if(obj7.entryNo().equals(words22[0]))
	    					obj51.list.add(obj7);
	    				}
	    				}
    				}
    			}
    				if(count == 0)
    				{
    					LinkedList<Student> list = new LinkedList<Student>();
    					Iterator<Position_<Student> > it4 = Students.positions();
    		    		if(Students.head.value().entryNo().equals(words22[0]))
    		    		{
    		    			list.add(Students.head.value());
    		    		}
    		    		else {
    		    			
    		    			while(it4.hasNext())
    		    			{
    		    				Student ob = it4.next().value();
    		    				if(ob.entryNo().equals(words22[0]))
    		    				{
    		    					 list.add(ob);
    		    				}
    		    				
    		    			}
    		    			
    		    		}
    		    		Courses objj = new Courses(words22[1], list);
    		    		allCourses.add(objj);

    				}
    			}
    		}
    	
    	else
    	{
    		LinkedList<Student> list = new LinkedList<Student>();
    		Iterator<Position_<Student> > it4 = Students.positions();
    		if(Students.head.value().entryNo().equals(words22[0]))
    		{
    			list.add(Students.head.value());
    		}
    		else {
    			while(it4.hasNext())
    			{
    				Student ob = it4.next().value();
    				if(ob.entryNo().equals(words22[0]))
    				{
    					 list.add(ob);
    					 break;
    				}
    				
    			}
    		}
    		Courses objj = new Courses(words22[1], list);
    		allCourses.add(objj);
    	}
    }
	    
	    FileReader fr2=new FileReader(coursesfilename);
		BufferedReader br2=new BufferedReader(fr2);

		while(br2.ready())
		{
			String str2=br2.readLine();
			String [] words2=str2.split(" ",4);
			String s60=words2[0];//entryNo
			String s61=words2[1];//coursenum
			String s62=words2[2];//coursegrade
			String s63=words2[3];//coursetitle
			
			CoursesWithTitle c=new CoursesWithTitle(s61, s63);
			CoursesListTitle.add(c);
		}
		fr2.close();
	    
	    
    }
    
    private static void answerQueries(String queries) throws IOException
    {
		
		  
	    FileReader fr11111=new FileReader(queries);
		BufferedReader br11111=new BufferedReader(fr11111);
		int n5=0;
		
		while(br11111.ready())
		{
			String str5=br11111.readLine();
			n5++;
		}
		fr11111.close();
		
		FileReader fr1111=new FileReader(queries);
		BufferedReader br1111=new BufferedReader(fr1111);
		String [] arr6=new String[n5];
		int i8=n5-1;
		
		while(br1111.ready())
		{
			String str1111=br1111.readLine();
			arr6[i8]=str1111;
			String x8=arr6[i8];
			i8--;
		}
		
		
		for(int i49=0;i49<arr6.length;i49++)
		{
			String words3=arr6[i49];
			String[] a10=words3.split(" ");
			
			String s7= a10[0];
			String s8=a10[1];//entryNo

			
			String s10=allHostels.head.value().name();
			String s11=allDepartments.head.value().name();
			String s12=allCourses.head.value().name();
			if(s7.equals("SHARE"))
			{
				String s9=a10[2];//query
				
				if(s10.equals(s9))
				{
					int i=0;
					String [] arr=new String[allHostels.head.value().list.count()-1];
					String s24=allHostels.head.value().list.head.value().entryNo();
					if(!s24.equals(s8))
					{
						arr[i]=s24;
						i++;
					}
					Iterator<Position_<Student_>> it5=allHostels.head.value().list.positions();
					while(it5.hasNext())
					{
						String s25=it5.next().value().entryNo();
						if(!s25.equals(s8))
						{
							arr[i]=s25;
							i++;
						}
					}
					
					int n6=arr.length;
					for(int i6 = 0; i6 < n6-1; ++i6) {
			            for (int j6 = i6 + 1; j6 < n6; ++j6) {
			                if (arr[i6].compareTo(arr[j6]) > 0) {
			                    String temp = arr[i6];
			                    arr[i6] = arr[j6];
			                    arr[j6] = temp;
			                }
			            }
			        }
					
					for(int i7 = 0; i7 < n6; i7++) 
					{
			            System.out.print(arr[i7]);
			        }
				}
				else
				{
					Iterator<Position_<Hostel>> it4=allHostels.positions();
					while(it4.hasNext())
					{	
						Hostel o = it4.next().value();
						if(s9.equals(o.name()))
						{
							int i=0;
							String [] arr=new String[o.list.count()-1];
							String s24=o.list.head.value().entryNo();
							if(!s24.equals(s8))
							{
								arr[i]=s24;
								i++;
							}
							Iterator<Position_<Student_>> it5=o.list.positions();
							while(it5.hasNext())
							{
								String s25=it5.next().value().entryNo();
								if(!s25.equals(s8)&&i<o.list.count()-1&&s9.equals(o.name()))
								{
									arr[i]=s25;
									i++;
								}
								
							}
							
							int n6=arr.length;
							if(n6!=0)
							{
							for(int i6 = 0; i6 < n6-1; ++i6) {
					            for (int j6 = i6 + 1; j6 < n6; ++j6) {
					                if (arr[i6].compareTo(arr[j6]) > 0) {
					                    
					                    String temp = arr[i6];
					                    arr[i6] = arr[j6];
					                    arr[j6] = temp;
					                }
					            }
					        }
							for(int i7 = 0; i7 < n6; i7++) {
					            System.out.print(arr[i7]+" ");
					        }
							}
							
						}
					}
				}
				
				if(s11.equals(s9))						//s9=entity name// s11=allDepartments head
				{
					int i1=0;
					String [] arr1=new String[allDepartments.head.value().list.count()-1];
					String s241=allDepartments.head.value().list.head.value().entryNo();
					if(!s241.equals(s8))
					{
						arr1[i1]=s241;
						i1++;
					}
					Iterator<Position_<Student_>> it51=allDepartments.head.value().list.positions();
					while(it51.hasNext())
					{
						String s251=it51.next().value().entryNo();
						if(!s251.equals(s8))
						{
							arr1[i1]=s251;
							i1++;
						}
						
					}
					int n61=arr1.length;
					for(int i61 = 0; i61 < n61-1; ++i61) {
			            for (int j61 = i61 + 1; j61 < n61; ++j61) {
			                if (arr1[i61].compareTo(arr1[j61]) > 0) {
			                    String temp1 = arr1[i61];
			                    arr1[i61] = arr1[j61];
			                    arr1[j61] = temp1;
			                }
			            }
			        }
					
					for(int i71 = 0; i71 < n61; i71++) {
			            System.out.print(arr1[i71]+" ");
			        }
				}
				else
				{
					
					Iterator<Position_<Department>> it41=allDepartments.positions();
					while(it41.hasNext())
					{	
						Department o1 = it41.next().value();
						if(s9.equals(o1.name()))
						{
							int i1=0;
							String [] arr1=new String[o1.list.count()-1];
							String s241=o1.list.head.value().entryNo();
							if(!s241.equals(s8))
							{
								arr1[i1]=s241;
								i1++;
							}
							Iterator<Position_<Student_>> it51=o1.list.positions();
							while(it51.hasNext())
							{
								String s251=it51.next().value().entryNo();
								if(!s251.equals(s8)&&i1<o1.list.count()-1)
								{
									arr1[i1]=s251;
									i1++;
								}
								
							}
							int n61=arr1.length;
							if(n61!=0)
							{
								for(int i61 = 0; i61 < n61-1; ++i61) 
								{
						            for (int j61 = i61 + 1; j61 < n61; ++j61) 
						            {
						                if (arr1[i61].compareTo(arr1[j61]) > 0) 
						                	{
						                    String temp1 = arr1[i61];
						                    arr1[i61] = arr1[j61];
						                    arr1[j61] = temp1;
							                }
							        }
						        }
							
								for(int i71 = 0; i71 < n61; i71++) 
								{
						            System.out.print(arr1[i71]+" ");
						        }
							}
						}
					}
				}
				
				
			if(s12.equals(s9))
			{
				int i11=0;
				String [] arr11=new String[allCourses.head.value().list.count()-1];
				String s2411=allCourses.head.value().list.head.value().entryNo();
				if(!s2411.equals(s8))
				{
					arr11[i11]=s2411;
					i11++;
				}
				Iterator<Position_<Student>> it511=allCourses.head.value().list.positions();
				while(it511.hasNext())
				{
					String s2511=it511.next().value().entryNo();
					if(!s2511.equals(s8))
					{
						arr11[i11]=s2511;
						i11++;
					}
					
				}
				int n611=arr11.length;
				if(n611!=0)
				{
						for(int i611 = 0; i611 < n611-1; ++i611) 
						{
			            for (int j611 = i611 + 1; j611 < n611; ++j611) 
			            {
			                if (arr11[i611].compareTo(arr11[j611]) > 0) 
			                {
			                    String temp11 = arr11[i611];
			                    arr11[i611] = arr11[j611];
			                    arr11[j611] = temp11;
			                }
			            }
			        }
					
					for(int i711 = 0; i711 < n611; i711++) {
			            System.out.print(arr11[i711]+" ");
			        }
				}
			}
			else
			{
				
				Iterator<Position_<Courses>> it411=allCourses.positions();
				while(it411.hasNext())
				{	
					Courses o11 = it411.next().value();
					if(s9.equals(o11.name()))
					{
						int i11=0;
						String [] arr11=new String[o11.list.count()-1];
						String s2411=o11.list.head.value().entryNo();
						if(!s2411.equals(s8)&&i11<o11.list.count()-1)
						{
							arr11[i11]=s2411;
							i11++;
						}
						Iterator<Position_<Student>> it511=o11.list.positions();
						while(it511.hasNext())
						{
							String s2511=it511.next().value().entryNo();
							if(!s2511.equals(s8)&&i11<o11.list.count()-1)
							{
								arr11[i11]=s2511;
								i11++;
							}
							
							
						}
						int n611=arr11.length;
						if(n611!=0)
						{	
							for(int i611 = 0; i611 < n611-1; ++i611) 
							{
					            for (int j611 = i611 + 1; j611 < n611; ++j611) 
					            {
					                if (arr11[i611].compareTo(arr11[j611]) > 0) 
					                {
					                    String temp11 = arr11[i611];
					                    arr11[i611] = arr11[j611];
					                    arr11[j611] = temp11;
					                }
					            }
							}
						
							for(int i711 = 0; i711 < n611; i711++) 
							{
								System.out.print(arr11[i711]+" ");
							}
						}	
					}
				}
					
			}
		}	
//			IF QUERY IS COURSETITLE
			else if(s7.equals("COURSETITLE"))
			{
				
				String s40=CoursesListTitle.head.value().coursenum();
				
				if(s40.equals(s8))
				{
					
					System.out.printf(CoursesListTitle.head.value().coursetitle());
				}
				else
				{
					Iterator<Position_<CoursesWithTitle>> it91=CoursesListTitle.positions();
					while(it91.hasNext())
					{
						CoursesWithTitle s1=it91.next().value();
						if(s8.equals(s1.coursenum()))
						{
							System.out.print(s1.coursetitle()+" " );
							break;
						}
						
					}
					
				}
				
			}
//			IF QUERY IS INFO
			else
			{
				String s50=Students.head.value().entryNo();
				if(s50.equals(s8))
				{
					String a9="";
					LinkedListIterator<CourseGrade> it10=new LinkedListIterator<CourseGrade>(Students.head.value().list.head);
					
					CourseGrade c8=it10.next().value();
							
					a9+= c8.coursenum();
					a9+=" ";
					a9+=c8.coursetitle();
					a9+=" ";
					System.out.println(Students.head.value().entryNo()+" " + Students.head.value().name()+" "+ Students.head.value().department()+" "+ Students.head.value().hostel()+ " "+ Students.head.value().cgpa()+ " " + a9 );
				}
				else
				{
					LinkedListIterator<Student> it9=new LinkedListIterator<Student>(Students.head);
					while(it9.hasNext())
					{
						Student s=(Student) it9.next().value();
						if(s8.equals(s.entryNo()))
						{
							System.out.printf(s.entryNo()+" " + s.name()+" "+ s.department()+" "+ s.hostel()+ " "+ s.cgpa()+ " " );
							
							String[] array = new String[s.list.count()];
	    					String[] array2 = new String[s.list.count()];
	    					int i=0;
	    	    			CourseGrade rj = s.list.head.value();
	    	    			array[i] = rj.coursenum();
	    	    			array2[i] = rj.g;
	    	    			i++;
	    	    			Iterator<Position_<CourseGrade>> iiit = s.list.positions();
	    	    			while(iiit.hasNext())
	    	    			{
	    	    				CourseGrade rj2 = iiit.next().value();
	    	    				array[i] = rj2.coursenum();
	    	    				array2[i] = rj2.g;
	    	    				i++;
	    	    			}
	    	    			for (int p = 0; p < ( array.length - 1 ); p++) {
	    	  				      for (int d = 0; d < array.length - p - 1; d++) {
	    	  				    	  if(array[d].compareTo(array[d+1]) > 0)
	    	  				        {
	    	  				          String swap = array[d];
	    	  				          array[d]   = array[d+1];
	    	  				          array[d+1] = swap;
	    	  				          swap = array2[d];
	    	  				          array2[d] = array2[d+1];
	    	  				          array2[d+1] = swap;
	    	  				        }
	    	  				      }
	    	  				    }
	    		    			
	    		    			for(int t = 0; t<array.length; t++)
	    	    				{
	    	    					System.out.print(array[t]+ " " + array2[t]+ " ");
	    	    				}
	    					break;
						}
						
					}
					
				}
				
			}
			System.out.println("");
		}
    }
	public static void main (String[] args) throws IOException
	{
		getData(args[0],args[1]);
		
		answerQueries(args[2]);
	}
}




