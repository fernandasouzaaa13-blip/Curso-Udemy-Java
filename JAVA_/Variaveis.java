package JAVA_; // Define o pacote onde esta classe está localizada.

public class Variaveis { // Declara a classe chamada Variaveis.

    // Método principal. É por aqui que o programa começa a ser executado.
    public static void main(String[] args) {

        // int → Armazena números inteiros (sem casas decimais).
        int idade = 25;

        // double → Armazena números decimais (com casas decimais).
        double altura = 1.60;

        // String → Armazena textos, sempre entre aspas duplas.
        String nome = "Fernanda";

        // boolean → Armazena apenas dois valores:
        // true (verdadeiro) ou false (falso).
        boolean estudando = true;

        // System.out.println() → Exibe informações no terminal.

        // O operador + concatena (junta) textos e variáveis.
        System.out.println("Nome: " + nome);

        // Concatena a variável idade com o texto " anos".
        System.out.println("Idade: " + idade + " anos");

        // Concatena a variável altura com o texto " metros".
        System.out.println("Altura: " + altura + " metros");

        // Exibe o valor da variável booleana (true ou false).
        System.out.println("Está estudando? " + estudando);
    }
}