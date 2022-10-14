package ComHerança;

public class LivroDigital extends Livro {

	//NOVO
	public String linkDownload;
	public int tamanhoMB;
	

	 //MUDOU
	public float imposto() {
		return 0.2f * lucro() + 2;
	}
	
	//NOVO
	public float tamanhoPorPagina() {
		return tamanhoMB/(float)paginas;
	}

}
