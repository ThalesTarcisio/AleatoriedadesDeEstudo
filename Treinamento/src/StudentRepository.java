import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
	
	private List<Student> dbStudents = new ArrayList<Student>();
	
	public Student createStudent(Student student) {
		dbStudents.add(student);
		return student;
	}
	
	public Student updateStudent(Student student ) {
		for (Student e: dbStudents) {
			if (e.equals(student)) {
				//ATUAIZO O OBJETO COM SEUS ATRIBUTOS		
			}
		}
		return student; //RETORNO O MESMO OBJEO ATUALIZADO
	}
	
	public void deleteStudent(Student student) {
		for (int i = 0; i < dbStudents.size(); i++) {
			Student studentActual = dbStudents.get(i);
			if(studentActual.equals(student)) {
				// REMOVO O OBJETO DA POSIÇÃO
				break;
			}
			
		}
	}
	
	public List<Student> readAll() {
		return this.dbStudents;
	}
}