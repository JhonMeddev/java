package Exercicios.ex3;

/*
 * EX3
 * - Crie uma classe Aluno com os:
 *  Atributos:
 *   string nome
 *   int matricula
 *   double desconto
 *   Curso curso
 */
public class Main {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Mario", 111, 0.1, new Curso("Engenharia", 1000));
		
		a1.info();
		//System.out.println("Pagamento: "+ a1.pagamento());
	}
}
