package empresaEx2;

/**
 * Ex2
 * -    Crie uma classe aluno com atributos string, nome, curso.
 * Crie também um atributo da Classe Avaliacao. Cada Auluno deve ter
 * uma Avaliacao associada. Crie uma mensagem que imprima as informações
 * completas desse aluno.
 *
 */

public class Main {

    public static void main(String[] args) {

    	Aluno a1 = new Aluno("Mario", "Encanador", new Avaliacao(9, 10, 3));
    	Aluno a2 = new Aluno("Luigi", "Encanador", new Avaliacao(4, 1, 10));
    	
    	a1.info();
    	a2.info();
    }
}
