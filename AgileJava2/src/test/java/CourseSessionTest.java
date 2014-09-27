import static org.junit.Assert.*;

import org.junit.Test;


public class CourseSessionTest {

	@Test
	public void testCreate() {
		CourseSession session = new CourseSession("ENGL", "101");
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
	}
}
