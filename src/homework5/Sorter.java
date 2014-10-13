package homework5;
import java.util.Comparator;

public class Sorter
{
	/**
	 * Return an instance of a class that realizes the Comparator interface. The class should 
	 * be an inner class. You must write the inner class, then return an instance of it. It 
	 * should compare students based on student id. Students with lower student ids should come first.
	 * @return an instance of a class that implements Comparator<Student>
	 */
	public static Comparator<Student> getStudentIdComparator()
	{
		return new StudentIdComparator();
	}
	
	private static class StudentIdComparator implements Comparator<Student>
	{
		@Override
		public int compare(Student s1, Student s2)
		{
			int s1Id = s1.getId();
			int s2Id = s2.getId();
			if (s1Id < s2Id) { return -1; }
			else if (s1Id > s2Id) { return 1; }
			else { return 0; }
		}
	}
	
	/**
	 * Return an instance of a class that realizes the Comparator interface. The class should 
	 * be an inner class. You must write the inner class, then return an instance of it. It 
	 * should compare courses based on department code. Compare them based on alphabetical ordering.
	 * "cs" comes before "mus"
	 * @return an instance of a class that implements Comparator<Course>
	 */
	public static Comparator<Course> getDepartmentComparator()
	{
		return new DepartmentComparator();
	}
	
	private static class DepartmentComparator implements Comparator<Course>
	{
		@Override
		public int compare(Course c1, Course c2)
		{
			String c1Department = c1.getDepartment();
			String c2Department = c2.getDepartment();
			return c1Department.compareTo(c2Department);
		}
	}
	
	/**
	 * Use selection sort to sort courses based on the number of enrolled students. Courses with fewer
	 * students should come first.
	 * @param courses the array of courses to sort
	 */
	public static void selectionSortCourses(Course[] courses)
	{
		for (int i = 0; i < courses.length - 1; i++)
		{
			int smallestCourse = i;
			for (int j = i + 1; j < courses.length; j++)
			{
				if (courses[j].size() < courses[smallestCourse].size()) { smallestCourse = j; }
			}
			Course temp = courses[i];
			courses[i] = courses[smallestCourse];
			courses[smallestCourse] = temp;
		}
	}
	
	/**
	 * Use merge sort to sort students based on their last names. Use alphabetical ordering based on
	 * the lastName field. So a student with the last name "arthur" should come before a student with
	 * the last name "presley".
	 * @param students the array to sort
	 * @return the sorted array
	 */
	public static Student[] mergeSortStudents(Student[] students)
	{
		if (students.length <= 1) { return students; }
		Student[] half1 = new Student[students.length / 2];
		Student[] half2 = new Student[students.length - half1.length];
		for (int i = 0; i < half1.length; i++)
		{
			half1[i] = students[i];
		}
		for (int i = 0; i < half2.length; i++)
		{
			half2[i] = students[half1.length + i];
		}
		half1 = mergeSortStudents(half1);
		half2 = mergeSortStudents(half2);
		
		//Merge
		int posHalf1 = 0;
		int posHalf2 = 0;
		int posStudents = 0;
		while (posHalf1 < half1.length && posHalf2 < half2.length)
		{
			if (half1[posHalf1].getLastName().compareTo(half2[posHalf2].getLastName()) < 0)
			{
				students[posStudents] = half1[posHalf1];
				posHalf1++;
			}
			else
			{
				students[posStudents] = half2[posHalf2];
				posHalf2++;
			}
			posStudents++;
		}
		while (posHalf1 < half1.length)
		{
			students[posStudents] = half1[posHalf1];
			posStudents++;
			posHalf1++;
		}
		while (posHalf2 < half2.length)
		{
			students[posStudents] = half2[posHalf2];
			posStudents++;
			posHalf2++;
		}
		return students;
	}

	/**
	 * Use binary search on the lastName field to return the index where the student is located in the
	 * array or -1 if that student isn't in the array.
	 * This will require a recursive helper method.
	 * @param students the array to search
	 * @return the index where the student is found, or -1 if not found
	 */
	public static int binarySearchStudents(String lastName, Student[] students)
	{
		return binarySearchHelper(lastName, students, 0, students.length - 1);
	}
	
	/**
	 * Recursive helper method for binarySearchStudents.
	 */
	private static int binarySearchHelper(String lastName, Student[] students, int lowerRange, int upperRange)
	{
		if (lowerRange <= upperRange)
		{
			int middle = (upperRange + lowerRange) / 2;
			if (students[middle].getLastName().equals(lastName)) { return middle; }
			else if (students[middle].getLastName().compareTo(lastName) < 0)
			{
				return binarySearchHelper(lastName, students, middle + 1, upperRange);
			}
			else
			{
				return binarySearchHelper(lastName, students, lowerRange, middle - 1);
			}
		}
		else { return -1; }
	}
}