package ex2;

public class Funcionario implements Imprimivel {
	
	String nome;
	String cpf;	
	
	public Funcionario(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	@Override
	public void imprimir() {
		System.out.println("Funcionarios");
		System.out.println("Nome: " + nome);
		System.out.println("Cpf: " + cpf);
		System.out.println("--------");		
	}
	
	

}
