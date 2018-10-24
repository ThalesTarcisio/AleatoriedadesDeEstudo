package utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dados.Contato;
import dados.Telefone;
import fabricas.FabricaDeConexao;
import fabricas.TipoDeConexao;

public class Busca {
	
	private static String usuario = "postgres";
    private static String senha = "root@123";
    private static String stringDeConexao = "jdbc:postgresql://localhost/agenda";

	
	public List<Contato> buscaGeral(String string) {
		try {			
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection(stringDeConexao, usuario, senha);
			
			String stringDeBuscaGeral = "select * from contatos where nome LIKE ? OR cpf LIKE ?"; 			
			
			PreparedStatement realizarBusca = connection.prepareStatement(stringDeBuscaGeral);						
			realizarBusca.setString(1, string);
			realizarBusca.setString(2, string);

			// Executa o comando para realizar a busca
			ResultSet rs = realizarBusca.executeQuery();			
			List<Contato> resultado = new ArrayList<Contato>();
			Contato contato = new Contato();
			while (rs.next()) {
				contato.setId(rs.getInt(1));
				contato.setNome(rs.getString(2));
				contato.setCpf(rs.getString(3));
				resultado.add(contato);
			}						
			
			// Executa 
			return resultado;
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
