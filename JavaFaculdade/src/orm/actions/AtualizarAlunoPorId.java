package orm.actions;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.model.Alunos;

public class AtualizarAlunoPorId {
	public static void main(String[] args) {
		Alunos aluno = new Alunos();
		long id = 1L;
		aluno.setId(id);
		
		
		System.out.println("Digite um novo nome:");
		Scanner nome = new Scanner(System.in);
		String name = nome.nextLine();
		aluno.setNome(name);
		
		System.out.println("Digite um novo CPF:");
		Scanner cpf = new Scanner(System.in);
		String cp = cpf.nextLine();
		aluno.setCPF(cp);
		
		System.out.println("Digite um novo Email:");
		Scanner email = new Scanner(System.in);
		String em = email.nextLine();
		aluno.setEmail(em);
		
		System.out.println("Digite uma nova Data:");
		Scanner data = new Scanner(System.in);
		String dn = data.nextLine();
		aluno.setDataNascimento(dn);
		
		System.out.println("Digite uma nova Naturalidade:");
		Scanner naturalidade = new Scanner(System.in);
		String natural = naturalidade.nextLine();
		aluno.setNaturalidade(natural);
		
		System.out.println("Digite um novo Endereço:");
		Scanner ende = new Scanner(System.in);
		String endereco = ende.nextLine();
		aluno.setEndereco(endereco);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.merge(aluno);
		manager.getTransaction().commit();
		
		System.out.println("Aluno atualizado, ID: "+aluno.getId());
		
		
		nome.close();
		cpf.close();
		email.close();
		data.close();
		data.close();
		naturalidade.close();
		ende.close();
		manager.close();
		factory.close();
		
		
	}

}
