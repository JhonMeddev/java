package ex4;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Turma nova = new Turma();
		
		nova.prof = new Professor();
		nova.prof.nome = "Dinna";
		nova.alunos = new ArrayList();
		nova.alunos.add(new Aluno());
		nova.alunos.get(0).nome = "Luana";

	}
}
