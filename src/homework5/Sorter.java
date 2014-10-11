package homework5;
import java.util.Comparator;

public class Sorter
{
	/**
	 * Return an instance of a class that realizes the
	 * Comparator interface. The class should be an inner
	 * class. You must write the inner class, then return
	 * an instance of it. It should compare students based
	 * on student id. Students with lower student ids should
	 * come first.
	 * 
	 * @return an instance of a class that implements Comparator<Student>
	 */
	public static Comparator<Student> getStudentIdComparator()
	{
		// YOUR CODE HERE
	}
	
	/**
	 * Return an instance of a class that realizes the
	 * Comparator interface. The class should be an inner
	 * class. You must write the inner class, then return
	 * an instance of it. It should compare courses based
	 * on department code. Compare them based on alphabetical
	 * ordering. "cs" comes before "mus"
	 * 
	 * @return an instance of a class that implements Comparator<Course>
	 */
	public static Comparator<Course> getDepartmentComparator()
	{
		// YOUR CODE HERE

	}
	
	/**
	 * Use selection sort to sort courses based on the
	 * number of enrolled students. Courses with fewer
	 * students should come first.
	 * 
	 * @param courses the array of courses to sort
	 */
	public static void selectionSortCourses(Course[] courses)
	{
		// YOUR CODE HERE
	}
	
	/**
	 * Use merge sort to sort students based on their
	 * last names. Use alphabetical ordering based on
	 * the lastName field. So a student with the last
	 * name "arthur" should come before a student with
	 * the last name "presley".
	 * 
	 * @param students the array to sort
	 */
	public static Student[] mergeSortStudents(Student[] students)
	{
		// YOUR CODE HERE
		return null;
	}

	/**
	 * Use binary search on the lastName field to return 
	 * the index where the student is located in the array
	 * or -1 if that student isn't in the array.
	 * 
	 * This will require a recursive helper method.
	 * 
	 * @param students the array to search
	 * @return the index where the student is found, or -1 if not found
	 */
	public static int binarySearchStudents(String lastName, Student[] students)
	{
		// YOUR CODE HERE
		return -1;
	}
}