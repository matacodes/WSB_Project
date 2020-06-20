import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author matacodes on 19/06/2020
 *
 */
public class Main {
	public static void main(String[]args) {
		Teacher teacher1 = new Teacher(1, "Piotr", "Pol", 2000);
		Teacher teacher2 = new Teacher(2, "Marta", "Matma", 2500);
		Teacher teacher3 = new Teacher(3, "Barbara", "Biolo",  1700);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(teacher1);
		teacherList.add(teacher2);
		teacherList.add(teacher3);
		
		Student student1 =new Student(1, "Alex", "Alexowy", 3);
		Student student2 =new Student(1, "Bartek", "Bartkowy", 2);
		Student student3 =new Student(1, "Celina", "Celinkowa", 4);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		
		School wsb = new School(null, null);
		
		System.out.println("WSB zarobi³o: " + wsb.getTotalMoneyEarned());
	
		System.out.println(student1.getFullName() + " musi jeszcze zap³aciæ " + student1.getRemainingFees());
		
		student1.payFees(1000);
		student2.payFees(3000);
		student3.payFees(2000);
		System.out.println(student1.getFullName() + " wp³aca czesne: " + student1.getFeesPaid());
		System.out.println(student1.getFullName() + " musi jeszcze zap³aciæ: " + student1.getRemainingFees());
		System.out.println(student2.getFullName() + " wp³aca czesne: " + student2.getFeesPaid());
		System.out.println(student2.getFullName() + " musi jeszcze zap³aciæ: " + student2.getRemainingFees());
		System.out.println(student3.getFullName() + " wp³aca czesne: " + student3.getFeesPaid());
		System.out.println(student3.getFullName() + " musi jeszcze zap³aciæ: " + student3.getRemainingFees());
		
		System.out.println();
		System.out.println("WSB zarobi³o: " + wsb.getTotalMoneyEarned());
		
		teacher1.receiveSalary(teacher1.getSalary());
		System.out.println("WSB wyp³aci³o " + teacher1.getFullName() + ": " + teacher1.getSalary());
		System.out.println("WSB wyda³o: " + wsb.getTotalMoneySpent());
				
		teacher2.receiveSalary(teacher2.getSalary());
		System.out.println("WSB wyp³aci³o: " + wsb.getTotalMoneySpent());
		
		teacher2.receiveSalary(teacher2.getSalary());
		System.out.println("WSB wyp³aci³o: " + wsb.getTotalMoneySpent());
		
		System.out.println(student1);
		
		
		
		
	
	}

}
