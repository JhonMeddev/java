package Enum;

enum Estacao{
	VERAO,
	OUTONO,
	INVERNO,
	PRIMAVERA
}

public class Roupa {
	
	String modelo;
	int tamanho;
	Estacao colecao;//1 VERAO; 2 OUTONO; 3 INVERNO; 4 PRIMAVERA
	
	public Roupa(String modelo, int tamanho, Estacao colecao) {
		super();
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.colecao = colecao;
	}

	public void msg(){
		switch (colecao) {
		case VERAO:
			System.out.println("Bem vindo ao verão!");
			break;
		case OUTONO:
			System.out.println("Bem vindo ao outono!");
			break;
		case INVERNO:
			System.out.println("Bem vindo ao inverno!");
			break;
		case PRIMAVERA:
			System.out.println("Bem vindo a primavera!");
			break;
		default:
			System.out.println("Opa");
		}
	}
	
}
