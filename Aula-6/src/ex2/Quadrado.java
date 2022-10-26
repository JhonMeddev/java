package ex2;

public class Quadrado implements Imprimivel{
	
	int medidaLado;

	public Quadrado(int medidaLado) {
		super();
		this.medidaLado = medidaLado;
	}

	@Override
	public void imprimir() {
		System.out.println("Medida Lado: "+ medidaLado);
		System.out.println("Area quadrado: "+ 4*medidaLado);
		
	}
	
	

}
