package Ex2;

public class Ingresso {

	public String nomeEvento;
	public double valor;	
	
	public Ingresso(String nomeEvento, double valor) {
		super();
		this.nomeEvento = nomeEvento;
		this.valor = valor;
	}

	void info() {
		System.out.println("Nome Evento: "+ nomeEvento);
		System.out.println("Valor Ingresso: "+ valor);
	}
}
