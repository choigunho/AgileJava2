package studentinfo;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class CourseSessionTest {

	@Test
	public void testCreate() {
		CourseSession session = new CourseSession("ENGL", "101");
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
	}
	
	@Test
	public void testEnrollStudents() {
		CourseSession session = new CourseSession("ENGL", "101");
		
		Student student1 = new Student("Cain Divoe");
		session.enroll(student1);
		ArrayList<Student> allStudents = session.getAllStudents();
		assertEquals(1, session.getNumberOfStudents());
		assertEquals(student1, allStudents.get(0));
		
		Student student2 = new Student("Coralee DeVaughn");
		session.enroll(student2);
		assertEquals(2, session.getNumberOfStudents());
		assertEquals(2, allStudents.size());
		assertEquals(student1, allStudents.get(0));
		assertEquals(student2, allStudents.get(1));
	}
}
