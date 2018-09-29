import java.util.List;

public class Team {
	
	private List<Student> students;
	private List<Classroom> classroom;
	private Integer period;
	
	
	
	public Team(Integer period) {
		this.period = period;
	}
		
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public List<Classroom> getClassroom() {
		return classroom;
	}
	public void setClassroom(List<Classroom> classroom) {
		this.classroom = classroom;
	}
	
	public Integer getPeriod() {
		return period;
	}
	public void setPeriod(Integer period) {
		this.period = period;
	}
	
	@Override
	public String toString() {
		return "Team [students=" + students + ", classroom=" + classroom + ", period=" + period + "]";
	}
	
}
