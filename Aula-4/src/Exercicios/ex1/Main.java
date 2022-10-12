package Exercicios.ex1;

/**
 * EX1
 * -Classe Nota
 *  Dois atributos privados :
 *   double nota1
 *   double nota2
 * @author jhonmed
 *
 */

public class Main {

	public static void main(String[] args) {
		
		Nota mario = new Nota();
		
		mario.setNota1(9);
		mario.setNota2(11);
		
		mario.resultado();
		
		mario.setNota1(2);
		mario.resultado();
		

	}

}
