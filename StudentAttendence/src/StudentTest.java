import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StudentTest {
	Admin admin;
	Student student;
	Clerk clerk;
	@Before
	public void setUp() throws Exception {
		admin = new Admin();
		student = new Student();
		clerk = new Clerk();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
