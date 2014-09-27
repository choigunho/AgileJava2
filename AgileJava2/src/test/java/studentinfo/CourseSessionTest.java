package studentinfo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;


public class CourseSessionTest {

	private CourseSession session;
	
	@Before
	public void setUp() {
		session = new CourseSession("ENGL", "101");
		
	}
	
	@Test
	public void testCreate() {
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
	}
	
	@Test
	public void testEnrollStudents() {
		
		Student student1 = new Student("Cain Divoe");
		session.enroll(student1);
		assertEquals(1, session.getNumberOfStudents());
		assertEquals(student1, session.get(0));
		
		Student student2 = new Student("Coralee DeVaughn");
		session.enroll(student2);
		assertEquals(2, session.getNumberOfStudents());
		assertEquals(student1, session.get(0));
		assertEquals(student2, session.get(1));
	}
	
	@Test
	public void testCourseDates() {
		int year = 103;
		int month = 0;
		int date = 6;
		Date startDate = new Date(year, month, date);
		
		CourseSession session = new CourseSession("ABCD", "200", startDate);
		
		year = 103;
		month = 3;
		date = 25;
		Date sixteenWeeksOut = new Date(year, month, date);
		assertEquals(sixteenWeeksOut, session.getEndDate());
	}
}
