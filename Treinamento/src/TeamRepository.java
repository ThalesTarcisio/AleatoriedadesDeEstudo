import java.util.ArrayList;
import java.util.List;

public class TeamRepository {
private List<Team> dbTeam = new ArrayList<Team>();
	
	public Team createTeam(Team team) {
		dbTeam.add(team);
		return team;
	}
	
	public Team updateTeam(Team team ) {
		for (Team e: dbTeam) {
			if (e.equals(team)) {
				//ATUAIZO O OBJETO COM SEUS ATRIBUTOS		
			}
		}
		return team; //RETORNO O MESMO OBJEO ATUALIZADO
	}
	
	public void deleteTeam(Team team) {
		for (int i = 0; i < dbTeam.size(); i++) {
			Team studentActual = dbTeam.get(i);
			if(studentActual.equals(team)) {
				// REMOVO O OBJETO DA POSIÇÃO
				break;
			}
			
		}
	}
	
	public List<Team> readAll() {
		return this.dbTeam;
	}
}
