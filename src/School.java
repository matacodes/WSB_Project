import java.util.List;

/**
 * 
 * @author matacodes on 18/06/2020
 * 
 *         School have many teachers and students - using ArrayList.
 *
 */
public class School {

	private List<Teacher> teachers;
	private List<Student> students;
	private int totalMoneyEarned;
	private int totalMoneySpent;

	/**
	 * Created of new school object
	 * 
	 * @param teachers - list of teachers in school
	 * @param students - list of students in school
	 */

	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;

	}

	/**
	 * 
	 * @return list of teachers in the school
	 */
	public List<Teacher> getTeachers() {
		return teachers;
	}

	/**
	 * Adds new teacher to the school.
	 * 
	 * @param teacher - new teacher that will be added
	 */
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	/**
	 * 
	 * @return list of students in the school
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * Adds new student to the school
	 * 
	 * @param student - new student that will be added to the school
	 */
	public void addStudent(Student student) {
		students.add(student);
	}

	/**
	 * 
	 * @return total money earned by the school
	 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	public void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned = totalMoneyEarned + moneyEarned;
	}

	/**
	 * 
	 * @return total money spent by the school
	 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	/**
	 * Update the money that school spent. For this project this is only teachers
	 * salaries.
	 * 
	 * @param moneySpent - money spent by school
	 */
	public void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned = totalMoneyEarned - moneySpent;
	}

}
