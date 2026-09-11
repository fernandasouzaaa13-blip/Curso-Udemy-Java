package Funcao_If; // Define o pacote onde esta classe está localizada.
// O package serve para organizar as classes do projeto.
// Pense nele como uma pasta que agrupa arquivos relacionados.

public class If_Exemplo_1 {
    // Declara a classe.
    // A classe é onde ficam armazenados os métodos e as instruções do programa.

    // Método principal (main).
    // Todo programa Java começa sua execução por este método.
    public static void main(String[] args) {

        // Declara uma variável do tipo inteiro.
        // int → Armazena apenas números inteiros.
        // A variável "idade" recebeu o valor 30.
        int idade = 30;

        // if → Estrutura de decisão.
        // Serve para executar um bloco de código SOMENTE
        // se a condição for verdadeira (true).

        // idade >= 18
        // >= significa "maior ou igual".
        //
        // O Java verifica:
        // 30 >= 18 ?
        //
        // Resultado:
        // true (verdadeiro)
        if (idade >= 18) {

            // Como a condição foi verdadeira,
            // este comando será executado.

            // System.out.println()
            // Exibe uma mensagem no terminal.
            System.out.println("Você é maior de 18 anos");
        }

        // Se a condição fosse falsa,
        // o Java simplesmente ignoraria
        // tudo o que está entre as chaves do if.
    }
}