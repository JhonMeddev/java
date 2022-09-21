import java.util.Scanner;

/*
 * Obtenha a entrada padrão peso(int), a altura(double) e imprima o IMC
 * (Índice de massa corpórea)
 * IMC = peso em quilogramas dividido pela altura em metros elevado ao
 * quadrado.
 * IMC = PESO / ALTURA²
 */
public class ex1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("CALCULADORA IMC");
		System.out.println("Qual seu peso ?");
		int peso = input.nextInt();
		System.out.println("Qual sua altura ?");
		double altura = input.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.println("IMC = " + imc);
	}
	
}
