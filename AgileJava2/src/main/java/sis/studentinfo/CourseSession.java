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
	
	private static int count;
	
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
	private CourseSession(String department, String number, Date startDate) {
		this.department = department;
		this.number = number;
		this.startDate = startDate;
	}
	
	public static CourseSession create(String department, String number, Date startDate) {
		CourseSession.incrementCount();
		return new CourseSession(department, number, startDate);
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String getNumber() {
		return number;
	}
	
	public int getNumberOfStudents() {
		return students.size();
	}
	
	public void enroll(Student student) {
		students.add(student);
	}
	
	public Student get(int index) {
		return students.get(index);
	}
	
	public Date getEndDate() {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(startDate);
		
		final int sessionLength = 16;
		final int daysInWeek = 7;
		final int daysFromFridayToMonday = 3;
		int numberOfDays = sessionLength * daysInWeek - daysFromFridayToMonday;
		
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		return calendar.getTime();
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public static void resetCount() {
		count = 0;
	}
	
	public static int getCount() {
		return count;
	}

	private static void incrementCount() {
		++count;
	}
	
	public ArrayList<Student> getAllStudents() {
		return students;
	}
	
}
