public class Student {

	private int id;
	private String name;
	private String surname;
	private int grade;
	private int feesPaid;
	private int feesTotal;

	/**
	 * Create new student. Fees are constant for each student = 5.000 PLN
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

		this.feesPaid = 0;
		this.feesTotal = 5000;

	}

	/**
	 * Update student's grade.
	 * 
	 * @param grade - new grade of the student
	 */

	public void setGrade(int grade) {
		this.grade = grade;
	}

	/**
	 * School receives funds as fees. feesPaid should be sum of fees paid.
	 * 
	 * @param fees - what student paid
	 */

	public void updateFeesPaid(int fees) {
		feesPaid = feesPaid + fees;
		School.updateTotalMoneyEarned(fees);
	}

	/**
	 * 
	 * @return id of the Student
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @return name of the student
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return surname of the student
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * 
	 * @return grade of the student
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * 
	 * @return fees paid by the student
	 */
	public int getFeesPaid() {
		return feesPaid;
	}

	/**
	 * 
	 * @return total fees by the student
	 */
	public int getFeesTotal() {
		return feesTotal;
	}
/**
 * 
 * @return remaining fees
 */
	public int getRemainingFees() {
		return feesTotal - feesPaid;
	}
}
