import java.util.List;

/**
 * 
 * @author matacodes on  18/06/2020
 * 
 * School have many teachers and students - using ArrayList.
 *
 */
public class School {

	private List<Teacher> teachers;
	private List<Student> students;
	private int totalMoneyEarned;
	private int totalMoneySpend;
	
	/**
	 * Created of new school object
	 * @param teachers - list of teachers in school
	 * @param students - list of students in school
	 */
	
	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
	}
	


}
