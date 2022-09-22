package ex5;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Aluno a = new Aluno();
		
		a.cpf="29048239042";
		a.nome = "neo";
		a.matricula = 1;
		
		a.info();
		
		Aluno b = new Aluno(2, "trinity", "90238409238");

		b.info();
	}
}
