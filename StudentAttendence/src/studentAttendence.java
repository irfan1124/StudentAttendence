import java.util.ArrayList;


public class studentAttendence {

	Subject sub1;
	ArrayList<Student> studlist = new ArrayList<Student>();
	
	public void setSubject(Subject sub) {
		// TODO Auto-generated method stub
		this.sub1= sub;
	}
	
	public void AddStudent(Person student) {
		// TODO Auto-generated method stub
		studlist.add((Student) student);
	}

	public Subject getSub() {
		// TODO Auto-generated method stub
		return this.sub1;
	}
}
