import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class StudentTest {
	Person admin;
	Person student;
	Person clerk;
	Subject sub1;
	public studentAttendence StudAtt;
	ArrayList<Student> studlist = new ArrayList<Student>();
	ArrayList<Student> studlist_percentage = new ArrayList<Student>();
	PerMonthAttendance per_mon_studattendance;
	@Before
	public void setUp() throws Exception {
		admin = new Admin("Munib");
		Student student1 = new Student("Irfan",1);
		Student student2 = new Student("Macroy",2);
		Student student3 = new Student("Akhilendra",3);
		Student student4 = new Student("Anish",4);
		Student student5 = new Student("Munib",5);
		Student student6 = new Student("Shekhar",6);
		studlist.add(student1);
		studlist.add(student2);
		studlist.add(student3);
		studlist.add(student4);
		studlist.add(student5);
		studlist.add(student6);
		clerk = new Clerk("Surya");
		sub1 = new Subject("java");
		StudAtt = new studentAttendence();
		
		for(int i=1;i<=15;i++)
		{
			StudAtt = new studentAttendence();
			StudAtt.setSubject(sub1);
			for(int j=1;j<=3;j++)
			{
				if(j==studlist.get(j).getRollNo())
				{
					StudAtt.AddStudent(studlist.get(j));
				}
			}
			per_mon_studattendance.addattendance(StudAtt);
		}
		for(int j=1;j<=5;j++)
		{
			StudAtt = new studentAttendence();
			StudAtt.setSubject(sub1);
			if(studlist.get(j).getRollNo()%2==1)
			{
				StudAtt.AddStudent(studlist.get(j));
			}
			per_mon_studattendance.addattendance(StudAtt);
		}
		 studlist_percentage=((Clerk) clerk).calculate(per_mon_studattendance);
		 
	}
	

	@Test
	public void test() {
		StudAtt.setSubject(sub1 );
		//StudAtt.AddStudent(student1);
		
		//assertTrue(sub1.equals(StudAtt.getSub()));
		//assertEquals("Irfan",(student.getname()));
		
	}

}
