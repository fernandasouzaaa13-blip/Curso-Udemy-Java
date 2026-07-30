package Java_; // Define o pacote onde esta classe está localizada.

public class Constantes { // Declara a classe chamada Constantes.

    // Método principal. É por aqui que o programa começa a ser executado.
    public static void main(String[] args) {

        // final → Torna a variável uma constante.
        // Uma constante recebe um valor uma única vez e não pode ser alterada.
        // double → Armazena números decimais.
        final double PI = 3.14159;

        // Constantes são escritas em LETRAS MAIÚSCULAS por convenção.
        // int → Armazena números inteiros.
        final int ANO_ATUAL = 2025;

        // System.out.println() → Exibe informações no terminal.

        // O operador + concatena (junta) textos e variáveis.
        System.out.println("O valor de PI: " + PI);

        // Exibe o valor da constante ANO_ATUAL.
        System.out.println("Ano atual: " + ANO_ATUAL);
    }
}