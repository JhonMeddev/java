package Ex1;

public class LivroDigital extends Livro {
	
	private int download;
	private double tamanho;
	
	
	
	public LivroDigital(String titulo, String genero, int edicao, Autor autor, int download, double tamanho) {
		super(titulo, genero, edicao, autor);
		this.download = download;
		this.tamanho = tamanho;
	}
	
	public LivroDigital() {}
	
	//Anotação override para sobrescrever o método da super classe
	@Override
	public void info() {
		super.info();
		System.out.println("Download: " + download);
		System.out.println("Tamanho: " + tamanho);
	}
	
	
	public int getDownload() {
		return download;
	}
	public void setDownload(int download) {
		this.download = download;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	

}
