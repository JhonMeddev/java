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

        Avaliacao julia = new Avaliacao(7,4,10);

        System.out.println("Média Aritmetica : " + julia.mediaAritmetica());
        System.out.println("Média Ponderada : " + julia.mediaPonderada());
    }
}
