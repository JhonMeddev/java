package Exercicios.ex1;

public class Conta {

	String nome;
	double saldo;
	
	public Conta(String nome, double saldo) {
		super();
		this.nome = nome;
		this.saldo = saldo;
	}

	void depositar(double valor){
		if(valor<0) {
			throw new RuntimeException("Valor Invalido");
		}
		saldo+=valor;
		
	}
	
	void sacar(double valor) {
		
		if(valor > saldo) {
			throw new RuntimeException("Saldo Insuficiente");
		}
		if(valor<0) {
			throw new RuntimeException("Valor Invalido");
		}
		saldo-=valor;
		
	}
	
	void transferir(double valor, Conta destino) {

		sacar(valor);
		destino.depositar(valor);
	}
	
	void info() {
		System.out.println("-------");
		System.out.println("Nome: "+ nome);
		System.out.println("Saldo: "+saldo);
	}	
	
}
