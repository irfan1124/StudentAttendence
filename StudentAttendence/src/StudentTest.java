import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StudentTest {
	Person admin;
	Person student;
	Person clerk;
	Subject sub1;
	studentAttendence StudAtt;
	@Before
	public void setUp() throws Exception {
		admin = new Admin("Munib");
		student = new Student(null);
		clerk = new Clerk(null);
		sub1 = new Subject("java");
		StudAtt = new studentAttendence();
		
	}

	@Test
	public void test() {
		StudAtt.setSubject(sub1 );
		StudAtt.AddStudent(student);
		
		assertTrue(sub1.equals(StudAtt.getSub()));
		
	}

}
