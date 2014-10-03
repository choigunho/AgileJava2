import static org.junit.Assert.*;

import org.junit.Test;

import sis.studentinfo.Student;


public class StudentTest {

	@Test
	public void testCreate() {
		Student student = new Student("Jane Doe");
		String studentName = student.getName();
		assertEquals("Jane Doe", studentName);
	}
	
	@Test
	public void testBadStatic() {
		
	}
}
