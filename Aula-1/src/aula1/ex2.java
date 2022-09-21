package aula1;

import java.util.Scanner;

/*
 * - Leônidas é constantemente questionado sobre quantos soldados seus 300
 * espartanos irão enfretar
 * - Ajude Leônidas fazendo um pequeno jogo de adivinhação em que o jogador
 * deve dar um palpite. Se o palpite for abaixo ou acima do valor correto, imprima
 * mensagens adequadas informando o fato
 * - Valor correto: 10.000
 */

public class ex2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int palpite;
		int valorCorreto = 10000;
		System.out.println("Digite seu palpite: ");
		palpite = input.nextInt();
		
		String msg;
		
		while(palpite != valorCorreto) {
			
			msg = palpite>valorCorreto?"Um pouco menos...":"Um pouco mais...";
			System.out.println(msg);
			
			/*if (palpite > valorCorreto) {
				System.out.println("Um pouco menos...");
			}
			else {
				System.out.println("Um pouco mais ...");
			}*/
			
			System.out.println("Digite outro palpite: ");
			palpite = input.nextInt();
		}
		
		System.out.println("Parabéns, acertou !");
	}
}
