package sis.studentinfo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Provides a rpresentation of a single-semester
 * session of a specific university course.
 * @author gunho
 */
public class CourseSession {
	
	private String department;
	private String number;
	private ArrayList<Student> students = new ArrayList<Student>();
	private Date startDate;
	
	CourseSession(String department, String number) {
		this.department = department;
		this.number = number;
	}
	
	/**
	 * Constructs a CourseSession starting on a specific date
	 * 
	 * @param department
	 * @param number
	 * @param startDate
	 */
	public CourseSession(String department, String number, Date startDate) {
		this.department = department;
		this.number = number;
		this.startDate = startDate;
	}
	
	String getDepartment() {
		return department;
	}
	
	String getNumber() {
		return number;
	}
	
	int getNumberOfStudents() {
		return students.size();
	}
	
	public void enroll(Student student) {
		students.add(student);
	}
	
	Student get(int index) {
		return students.get(index);
	}
	
	Date getEndDate() {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(startDate);
		
		final int sessionLength = 16;
		final int daysInWeek = 7;
		final int daysFromFridayToMonday = 3;
		int numberOfDays = sessionLength * daysInWeek - daysFromFridayToMonday;
		
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		return calendar.getTime();
	}
	
	Date getStartDate() {
		return startDate;
	}

	public ArrayList<Student> getAllStudents() {
		return students;
	}
}
