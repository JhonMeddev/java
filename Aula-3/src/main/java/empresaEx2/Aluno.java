package empresaEx2;


public class Aluno {

	public String nome;
	public String curso;
	public Avaliacao notas;

	
	
	
	public Aluno(String nome, String curso, Avaliacao notas) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.notas = notas;
	}




	void info() {
		System.out.println("Nome: "+ nome);
		System.out.println("Curso: "+ curso);
		System.out.println("Media Aritimética: "+ notas.mediaAritmetica());
		System.out.println("Media Ponderada: "+ notas.mediaPonderada());
	}
	
}
