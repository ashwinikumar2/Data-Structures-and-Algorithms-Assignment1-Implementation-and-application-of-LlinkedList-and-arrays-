COL106 SEMESTER I 2019-20
ASHWINI KUMAR
2018MT60778
GROUP 3

About Assignment
In this assignment we were given three files as arguments named as student.txt,courses.txt and qury.txt which we had to read and then implement different types of interfaces such as:
 
public interface Position_<T> {..}

public interface LinkedList_<T> {..}

public interface Entity_ {.....}

public interface GradeInfo_ {...}

public interface CourseGrade_ {...}

public interface Student_ {..}

Classes used are:
Class Node<T> implements interface Position_<T> which has two methods T value() and Position_ after().

Class LinkedList<T> implemnts interface LinkedList_ which contains methods add(T e),positions() and count().

Class LinkedListIterator<T> implements interface Iterator<Position_<T>>.

Class Student implements Student_ whose objects are used to obtain the complete information of a student.

Classes Hostel,Departments and Courses implements the interface Entity_ and are used in LinkedLists allHostels,allDepartments and allCourses.

Class CourseGrade implements interface CourseGrade_.

Class Iteratornew<T> implements Iterator<T>.

Class GradeInfo implements GradeInfo_ which contains information about a grade.

Class CourseWithTitle contains two methods coursetitle and coursenum.

LinkedLists used are:
In LinkedList allHostels I put the objects of class Hostel which itself contains list of students in the form of objects of class Student.

Similarly, LinkedLists allDepartments(and allCourses) contains the objects of class Hostel(Courses) which itself contains the list of students in the form of objects of class Student.

LinkedList Students and Students1 contains the objects of class Student.

LinkedList CourseListTitle contains the objects of class CourseWithTitle.
  
For making one of the LinkedLists allHostels,allDepartments and allCourses I checked whether the LinkedList is empty or not, if it is empty then make an object of class Student and then add it to the LinkedList else
check whether that object of class Student is already present in the LinkedList. If present then add the recently scanned entry number from the file to the existing list of that entity.

Reading Files:
I read all three files using File Reader and BufferedReader.

For calculating the cgpa and completed credits for each student I accessed each node of the LinkedList Student and upadated the count of completed credits and total credits accordingly i.e. increased 3 credits in 
both(and increased the grade ponts simultaneously) if the grade is not E,F or I else if the grade is E,F then increased the credits in total credits but not in completed credits 

For answering the queries Share ,Coursetitle and Info, I collected the data from all the LinkedLists using the various methods implemented in class LinkedList.
Query SHARE has been enquired by iterating over the LinkedList allHostels,allDepartments and allCourses.
Query COURSETITLE has been enquired by iterating over the LinkedList CourseListTitle.
Query INFO has been enquired by iterating over the LinkedList Students.

In the method private static void getData I collected and processed all the data taken as input from two files named student.txt and courses.txt.
In the method private static void answerQueries I read the file query.txt and provided the required outputs.

References :
(1)Used Bubble sort for arranging entry numbers in lexicographic order from online source(including split function).
(2)Discussed the approximation of CGPA to second decimal place with friends.




