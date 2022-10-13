package Exercicios.ex2;


/*
 *  EX2
 *  - Adicionar o atributo faltas.No resultado, para quem tiver acima de 
 *  sete faltas, imprimir "reprovado por faltas"
 */
public class Main {

	public static void main(String[] args) {

		
		Nota mario = new Nota();
		
		mario.setNota1(9);
		mario.setNota2(10);
		mario.setFaltas(7);
		
		
		mario.resultado();
		
		mario.setNota1(2);
		mario.resultado();
	}

}
