package Ex2;

public class IngressoVip extends Ingresso {


	public double adicional;
	
	public IngressoVip(String nomeEvento, double valor) {
		super(nomeEvento, valor);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("Valor adicional: " + adicional);
		System.out.println("Valor total: "+ valor + adicional);
	}

}
