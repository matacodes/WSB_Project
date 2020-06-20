/**
 * 
 * @author matacodes on 18/06/2020
 * 
 *         Keeping the track of teachers: id, name, surname, salary.
 *
 */
public class Teacher {

	private int id;
	private String name;
	private String surname;
	private int salary;
	private int salaryEarned;

	/**
	 * Create new Teacher object
	 * 
	 * @param id      - id of the teacher
	 * @param name    - name of the teacher
	 * @param surname - surname of teacher
	 * @param salary  - salary of the teacher
	 */
	public Teacher(int id, String name, String surname, int salary) {

		this.id = id;
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.salaryEarned = 0;
	}

	/**
	 * 
	 * @return name of current teacher
	 */

	public String getFullName() {
		return (name + " " + surname);
	}

	/**
	 * 
	 * @return the id for current teacher
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @return salary of current teacher
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * Salary set.
	 * 
	 * @param salary
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * Adds to salaryEarned. Remove from total money earned by School
	 * 
	 * @param salary
	 */
	public void receiveSalary(int salary) {
		salaryEarned = salaryEarned + salary;
		School.updateTotalMoneySpent(salary);
	}
}
