package ex3;

/*
 * -Crie uma classe conta para administrar contas correntes
 * de um banco.
 * */

public class Conta {
	
	public int numero;
	public String titular;
	public float saldo;
	public float limite;
	
	public Conta(int numero, String titular, float saldo, float limite) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	boolean sacar(float valor) {
		if (valor > limite || valor > saldo) {
			return false;
		}
		saldo -= valor;
		return true;
	}
	
	boolean depositar(float valor) {
		if(valor <= 0) {
			return false;
		}
		saldo+= valor;
		return true;
	}
	

	
	void info() {
		System.out.println("Nome: "+ titular);
		System.out.println("Numero: "+ numero);
		System.out.println("Saldo: "+ saldo);
		System.out.println("Limite: "+ limite );
	}

}
