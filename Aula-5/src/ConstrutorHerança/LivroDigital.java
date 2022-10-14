package ConstrutorHerança;

public class LivroDigital extends Livro {

	//NOVO
	public String linkDownload;
	public int tamanhoMB;
	
	
	 public LivroDigital(String titulo, String autor, String linkDownload) {
		super(titulo, autor);
		this.linkDownload = linkDownload;
	}

	//MUDOU
	public float imposto() {
		return 0.2f * lucro() + 2;
	}
	
	//NOVO
	public float tamanhoPorPagina() {
		return tamanhoMB/(float)paginas;
	}

}
