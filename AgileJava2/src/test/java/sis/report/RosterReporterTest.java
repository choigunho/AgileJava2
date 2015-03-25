package sis.report;
import static org.junit.Assert.*;

import org.junit.Test;

import sis.studentinfo.*;
import static sis.report.RosterReporter.NEWLINE;

public class RosterReporterTest {

	@Test
	public void testRosterReport() {
		CourseSession session = CourseSession.create("ENGL", "101", DateUtil.createDate(2003, 1, 6));
		
		session.enroll(new Student("A"));
		session.enroll(new Student("B"));
		
		String rosterReport = new RosterReporter(session).getReport();
		System.out.println(rosterReport);
		assertEquals(
				RosterReporter.ROSTER_REPORT_HEADER +
				"A" + NEWLINE +
				"B" + NEWLINE +
				RosterReporter.ROSTER_REPORT_FOOTER + "2" +
				NEWLINE, rosterReport);
	}
	
}
//choi
//1
//2