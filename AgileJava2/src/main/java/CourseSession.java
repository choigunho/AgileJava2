import java.util.ArrayList;

public class CourseSession {
	
	private String department;
	private String number;
	private int numberOfStudents = 0;
	private ArrayList<Student> students = new ArrayList<Student>();
	
	CourseSession(String department, String number) {
		this.department = department;
		this.number = number;
	}
	
	String getDepartment() {
		return department;
	}
	
	String getNumber() {
		return number;
	}
	
	int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	void enroll(Student student) {
		numberOfStudents = numberOfStudents + 1;
		students.add(student);
	}

	ArrayList<Student> getAllStudents() {
		return students;
	}
}
