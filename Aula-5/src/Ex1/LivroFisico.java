package Ex1;

public class LivroFisico extends Livro {

	private int tiragem;
	private int peso;	
	
	public LivroFisico(String titulo, String genero, int edicao, Autor autor, int tiragem, int peso) {
		super(titulo, genero, edicao, autor);
		this.tiragem = tiragem;
		this.peso = peso;
	}
	
	public LivroFisico() {}
	
	//Anotação override para sobrescrever o método da super classe
	@Override
	public void info() {
		super.info();
		System.out.println("Tiragem: "+ tiragem);
		System.out.println("Peso: "+ peso);
	}
	
	public int getTiragem() {
		return tiragem;
	}
	public void setTiragem(int tiragem) {
		this.tiragem = tiragem;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
}
