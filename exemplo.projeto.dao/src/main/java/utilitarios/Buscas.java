package utilitarios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dados.Contato;
import dados.Telefone;
import fabricas.FabricaDeConexao;
import fabricas.TipoDeConexao;

public class Buscas {
	
	private Connection connection = null;

	public void ContatoPostgres(TipoDeConexao tipo) {
		if (connection == null) {
			connection = FabricaDeConexao.getInstancia(tipo);
		}
	}

	
	public List<Contato> buscaGeral(String string) {
		try {
			connection.setAutoCommit(false);
			
			String stringDeBuscaGeral = "select * from contato where id = ? OR nome = ? OR cpf = ?"; 			
			
			PreparedStatement realizarBusca = connection.prepareStatement(stringDeBuscaGeral);						
			realizarBusca.setString(1, string);
			realizarBusca.setString(2, string);
			realizarBusca.setString(3, string);

			// Executa o comando de cadastro do contato
			ResultSet rs = realizarBusca.executeQuery();			
			rs.next();
			int id_contato = rs.getInt(1);
			List<Contato> resultado;					
			
			// Executa 
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
	}
	
	public List<Contato> buscaAvancada(String string, String campo) {
		return null;
	}

}
