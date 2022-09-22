package ex1;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Hello WOrld");
		Aluno a = new Aluno();
		
		a.matricula = 55;
		a.nome = "Joana";
		a.cpf = "89023741343";
		
		System.out.println("Matricula: "+ a.matricula);
		System.out.println("Nome: "+ a.nome);
		System.out.println("CPF: "+ a.cpf);
			
	}
}
