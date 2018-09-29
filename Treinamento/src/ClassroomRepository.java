import java.util.ArrayList;
import java.util.List;

public class ClassroomRepository {
	
private List<Classroom> dbClassrooms = new ArrayList<Classroom>();
	
	public Classroom createClassroom(Classroom classroom) {
		dbClassrooms.add(classroom);
		return classroom;
	}
	
	public Classroom updateClassroom(Classroom classroom) {
		for (Classroom e: dbClassrooms) {
			if (e.equals(classroom)) {
				//ATUAIZO O OBJETO COM SEUS ATRIBUTOS		
			}
		}
		return classroom; //RETORNO O MESMO OBJEO ATUALIZADO
	}
	
	public void deleteClassroom(Classroom classroom) {
		for (int i = 0; i < dbClassrooms.size(); i++) {
			Classroom classroomActual = dbClassrooms.get(i);
			if(classroomActual.equals(classroom)) {
				// REMOVO O OBJETO DA POSIÇÃO
				break;
			}
			
		}
	}
	
	public List<Classroom> readAll() {
		return this.dbClassrooms;
	}
}
