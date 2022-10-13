package Exercicios.ex3;

public class Aluno {
	
	 String nome;
	 int matricula;
	 double desconto;
	 Curso curso;
	 
	 
	public Aluno(String nome, int matricula, double desconto, Curso curso) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.desconto = desconto;
		this.curso = curso;
	}
	 
	 void info() {
		 System.out.println("Nome do Aluno: "+nome);
		 System.out.println("Curso do Aluno: "+matricula);
		 System.out.println("Desconto do Aluno: "+desconto);
		 System.out.println("Paagamento Aluno: "+ pagamento());
		 curso.info();
	 }
	 
	 double pagamento() {
		 return curso.mensalidade *(1-desconto);
	 }

}
