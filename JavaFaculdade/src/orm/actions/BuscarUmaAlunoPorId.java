package orm.actions;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.model.Alunos;

public class BuscarUmaAlunoPorId {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um id:");
		long id = sc.nextLong();
		Alunos aluno = manager.find(Alunos.class, id);
		
		
		System.out.println("ID: "+aluno.getId());
		System.out.println("Nome: "+aluno.getNome());
		System.out.println("Email: "+aluno.getEmail());
		System.out.println("CPF: "+aluno.getCPF());
		System.out.println("Data de Nascimento: "+aluno.getDataNascimento());
		System.out.println("Natural: "+aluno.getNaturalidade());
		System.out.println("Endereço: "+aluno.getEndereco());
		
		sc.close();
		manager.close();
		factory.close();

	}

}
