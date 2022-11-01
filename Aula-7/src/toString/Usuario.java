package toString;

import java.util.Objects;

public class Usuario {
	
	int id;
	String nome;
	String cpf;
	
	public Usuario(int id, String nome, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", cpf=" + cpf + "]";
	}

	
	

}
