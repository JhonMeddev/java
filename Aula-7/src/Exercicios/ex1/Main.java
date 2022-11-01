package Exercicios.ex1;

public class Main {
	
	public static void main(String[] args) {
		
		Conta c1 = new Conta("Mario", 5000);
		Conta c2 = new Conta("Luigi", 2000);
		
		try {
			c1.info();
			c1.depositar(300);
			c1.info();
			c1.sacar(800);
			c1.info();
			c2.info();
			c1.transferir(400, c2);
			c1.info();
			c2.info();
		} catch (Exception e) {
			System.out.println("Ocorreu um erro, coloque outro valor");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Fechando o programa");
		}
	}

}
