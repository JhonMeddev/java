package ex2;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Hello WOrld");
		Aluno a = new Aluno();
		
		a.matricula = 1;
		a.nome = "Neo";
		a.cpf = "89023741343";
		
		Aluno b = new Aluno();
		
		b.matricula = 2;
		b.nome = "Trinity";
		b.cpf = "3423423";
		
		a.info();
		b.info();
	}
}
