package ex3;

public class Main {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(111, "Mario", 2000, 500);
		
		c1.info();
		
		c1.sacar(200);
		
		c1.depositar(500);
		
		c1.info();

	}

}
