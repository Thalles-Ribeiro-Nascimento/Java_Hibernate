package orm.actions;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import orm.model.Alunos;

public class BuscaAluno {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();

		String sql = "from Alunos";
		Query query = manager.createQuery(sql);
		
		@SuppressWarnings("unchecked")
		List<Alunos> listAluno = query.getResultList();

		for (Alunos alunos : listAluno) {
			System.out.println("Nome: "+alunos.getNome());
			System.out.println("Email: "+alunos.getEmail());
			System.out.println("CPF: "+alunos.getCPF());
			System.out.println("Data de Nascimento: "+alunos.getDataNascimento());
			System.out.println("Naturalidade: "+alunos.getNaturalidade());
			System.out.println("Endereço: "+alunos.getEndereco());
			System.out.println(" ");
		}



	}

}
