import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author matacodes on 19/06/2020
 *
 */
public class Main {
	public static void main(String[]args) {
		Teacher PolP = new Teacher(1, "Piotr", "Pol", 5000);
		Teacher MatmaM = new Teacher(2, "Marta", "Matma", 4500);
		Teacher BioloB = new Teacher(3, "Barbara", "Biolo",  4700);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(PolP);
		teacherList.add(MatmaM);
		teacherList.add(BioloB);
		
		Student student1 =new Student(1, "Alex", "Alexowy", 3);
		Student student2 =new Student(1, "Bartek", "Bartkowy", 2);
		Student student3 =new Student(1, "Celina", "Celinkowa", 4);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		
		School school1 = new School(null, null);
		
		System.out.println(school1.getTotalMoneyEarned());
	}

}
