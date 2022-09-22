package ex5;

public class Aluno {
	
	int matricula;
	String nome;
	String cpf;
	
	Aluno(){}
	
	Aluno(int pMatricula, String pNome, String pCpf){
		matricula = pMatricula;
		nome = pNome;
		cpf = pCpf;
	}
	
	void info() {
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: "+ cpf);
	}

}
