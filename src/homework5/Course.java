package homework5;
import java.util.ArrayList;

public class Course
{
	private String departmentCode;
	private int number;
	private String name;
	public ArrayList<Student> enrolledStudents;
	
	public Course(String NewDepartmentCode, int NewNumber, String NewName)
	{
		this.departmentCode = NewDepartmentCode;
		this.number = NewNumber;
		this.name = NewName;
		this.enrolledStudents = new ArrayList<Student>();
	}
	
	public String getDepartment()
	{
		return this.departmentCode;
	}
	
	public void addStudent(Student newStudent)
	{
		this.enrolledStudents.add(newStudent);
	}
	public void addStudents(Student[] newStudents)
	{
		for(Student s : newStudents)
		{
			this.enrolledStudents.add(s);
		}
	}
	
	public int size()
	{
		return this.enrolledStudents.size();
	}
	
	@Override
	public String toString()
	{
		return this.departmentCode + "-" + this.number + ": " + this.name;
	}
}