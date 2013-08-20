import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StudentTest {
	Person admin;
	Person student;
	Person clerk;
	@Before
	public void setUp() throws Exception {
		admin = new Admin("Munib");
		student = new Student(null);
		clerk = new Clerk(null);
	}

	@Test
	public void test() {
		
	}

}
