package SuperEThis;

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
		return super.imposto() + 2;
	}
	
	//NOVO
	public float tamanhoPorPagina() {
		return tamanhoMB/(float)paginas;
	}
	
	//SUPER E THIS
	public void imprimirImposto() {
		System.out.println("Imposto livro Fisico: " + super.imposto());
		System.out.println("Imposto livro Digital: " + this.imposto());
	}

}
