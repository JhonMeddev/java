package Ex1;

public class Livro {
	
	private String titulo;
	
	private String genero;
	
	private int edicao;
	
	private Autor autor;
	
	

	public Livro(String titulo, String genero, int edicao, Autor autor) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.edicao = edicao;
		this.autor = autor;
	}
	
	public Livro() {}
	
	public void info() {
		System.out.println("Titulo Livro: "+ titulo);
		System.out.println("Genero livro: "+ genero);
		System.out.println("Edição Livro: "+ edicao);
		autor.info();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	

}
