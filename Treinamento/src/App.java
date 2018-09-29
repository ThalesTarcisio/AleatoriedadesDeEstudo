import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		Classroom classroom = new Classroom(3223, false, 12);		
		List<Student> listOfStudents = new ArrayList<Student>();
		
		for (int i = 0; i < 10; i++) {
			Student student = new Student(
					(i * i + 3),
					i + "Jon Doe",
					"Information Systems"
					);
			listOfStudents.add(student);
		}
		
		List<Classroom> listOfCLassrooms = new ArrayList<Classroom>();
		listOfClassrooms.add(classroom);
		Team team = new Team();
		
		System.out.println();
		
	}

}
