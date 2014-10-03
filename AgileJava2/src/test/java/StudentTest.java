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
	
	@Test
	public void testStudentStatus() {
		Student student = new Student("a");
		assertEquals(0, student.getCredits());
		assertFalse(student.isFullTime());
		
		student.addCredits(3);
		assertEquals(3, student.getCredits());
		assertFalse(student.isFullTime());
		
		student.addCredits(4);
		assertEquals(7, student.getCredits());
		assertFalse(student.isFullTime());
		
		student.addCredits(5);
		assertEquals(12, student.getCredits());
		assertTrue(student.isFullTime());
	}
}
