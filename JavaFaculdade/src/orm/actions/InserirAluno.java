package orm.actions;

import java.util.Scanner;

import javax.persistence.*;


import orm.model.Alunos;

public class InserirAluno {
	public static void main(String[] args) {
		Alunos aluno = new Alunos();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva seu nome:");
		String name = sc.nextLine();
		System.out.println("Olá "+name);
		System.out.println("Escreva seu email:");
		String email = sc.nextLine();
		System.out.println("Escreva seu CPF:");
		String cpf = sc.nextLine();
		System.out.println("Escreva sua Data de Nascimento:");
		String dn = sc.nextLine();
		System.out.println("Você é natural de onde?");
		String natural = sc.nextLine();
		System.out.println("Escreva seu endereço:");
		String endereco = sc.nextLine();
		
		aluno.setNome(name);
		aluno.setEmail(email);
		aluno.setCPF(cpf);
		aluno.setDataNascimento(dn);
		aluno.setNaturalidade(natural);
		aluno.setEndereco(endereco);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(aluno);
		manager.getTransaction().commit();
		
		System.out.println("Aluno inserido ID: "+aluno.getId());
		System.out.println("Nome: "+aluno.getNome());
		System.out.println("Email: "+aluno.getEmail());
		System.out.println("CPF: "+aluno.getCPF());
		System.out.println("Data de Nascimento: "+aluno.getDataNascimento());
		System.out.println("Naturalidade: "+aluno.getNaturalidade());
		System.out.println("Endereço: "+aluno.getEndereco());
		
		sc.close();
		manager.close();
		factory.close();
		
		
		
		
	}

}
