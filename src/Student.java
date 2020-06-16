
/**
 * 
 * @author matacodes 16/06/2020 This class keeps the track of students id, name,
 *         grade and fees.
 *
 */

public class Student {

	private int id;
	private String name;
	private String surname;
	private int grade;
	private int feesPaid;
	private int feesTotal;

	/**
	 * Create new student.
	 * 
	 * @param id      - unique id for each student
	 * @param name    - name of the student
	 * @param surname - surname of the student
	 * @param grade   - grade in which is a student
	 */

	public Student(int id, String name, String surname, int grade) {

		this.id = id;
		this.name = name;
		this.surname = surname;
		this.grade = grade;

	}

}
