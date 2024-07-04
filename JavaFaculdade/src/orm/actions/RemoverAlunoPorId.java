package orm.actions;

import java.util.Scanner;

import javax.persistence.*;
import orm.model.Alunos;

public class RemoverAlunoPorId {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		Alunos aluno = new Alunos();
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um ID: ");
		long id = sc.nextLong();
	
		aluno.setId(id);
		aluno = manager.find(Alunos.class, aluno.getId());
		
		
		manager.getTransaction().begin();
		manager.remove(aluno);
		manager.getTransaction().commit();
		
		System.out.println("Aluno removido!");
		
		sc.close();
		manager.close();
		factory.close();
		
	}

}
