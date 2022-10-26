package ex2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Mario", "423-234-234-23");
		Carro c1 = new Carro("Cobalt", "Preto", 4);
		Quadrado q1 = new Quadrado(9);
		
		ArrayList<Imprimivel> lista = new ArrayList();
		
		lista.add(q1);
		lista.add(c1);
		lista.add(f1);

		Imprimivel i = f1;
		i.imprimir();
		i = c1;
		i.imprimir();
		i = q1;
		i.imprimir();
	}

}
