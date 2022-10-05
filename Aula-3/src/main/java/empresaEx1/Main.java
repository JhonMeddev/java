package empresaEx1;

/**
 * Ex1
 * - Crie uma classe Avaliacao, com três atributos reais chamados nota1,
 * nota2, nota 3, e crie dois métodos para calcular e retornar diferentes tipos de média.
 * -Média aritmética
 * -Média ponderada(pesos 2,3 e 4)
 *
 */

public class Main {

    public static void main(String[] args) {

        Avaliacao julia = new Avaliacao(7,4,10);

        System.out.println("Média Aritmetica : " + julia.mediaAritmetica());
        System.out.println("Média Ponderada : " + julia.mediaPonderada());
    }
}
