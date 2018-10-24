package principal;

import java.util.ArrayList;
import java.util.List;

import com.sun.jersey.core.spi.scanning.uri.BundleSchemeScanner;

import dados.Contato;
import dados.Telefone;
import dados.TipoTelefone;
import dao.ContatoDAO;
import fabricas.FabricaDeContato;
import fabricas.TipoDeConexao;
import utilitarios.Busca;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Iniciando exemplo didático");
		
		
		System.out.println("Criando conexão com o banco de dados");
		ContatoDAO contatoDAO = FabricaDeContato.getInstancia(TipoDeConexao.POSTGRES);
		Busca busca = new Busca();
		try {
			
			Contato contato = new Contato();
			contato.setCpf("0101010101");
			contato.setNome("Joao");
			
			Telefone telefone1 = new Telefone();
			telefone1.setNumero("33333333");
			telefone1.setTipo(TipoTelefone.Contato);
			
			Telefone telefone2 = new Telefone();
			telefone2.setNumero("55555555");
			telefone2.setTipo(TipoTelefone.Contato);
			
			contato.addTelefone(telefone1);
			contato.addTelefone(telefone2);						
			
			System.out.println("Adicionando dados ao banco");
			
			contatoDAO.add(contato);
			
			List<Contato> resultadoBusca = new ArrayList<Contato>();
			resultadoBusca = busca.buscaGeral("09");
			for (Contato pessoa : resultadoBusca) {
				System.out.println(pessoa.getNome() + " : "
						+ pessoa.getCpf());
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Concluindo execução do exemplo.");
		}

	}

}
