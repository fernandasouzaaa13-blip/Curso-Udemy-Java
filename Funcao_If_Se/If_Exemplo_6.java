package Funcao_If_Se; // Define o pacote onde esta classe está localizada.
// O package serve para organizar as classes do projeto.
// Pense nele como uma pasta que agrupa arquivos relacionados.

public class If_Exemplo_6 {
    // Declara a classe.
    // Uma classe é um "molde" onde ficam armazenados
    // os métodos e as instruções do programa.

    // Método principal (main).
    // Todo programa Java começa sua execução por este método.
    public static void main(String[] args) {

        // boolean → Tipo de dado que armazena apenas dois valores:
        // true  -> Verdadeiro
        // false -> Falso
        //
        // A variável "temCarteira" representa se a pessoa
        // possui ou não carteira de motorista.
        //
        // Neste exemplo, ela recebeu o valor false,
        // ou seja, a pessoa NÃO possui carteira.
        boolean temCarteira = false;

        // if → Estrutura de decisão.
        // Executa um bloco de código somente
        // quando a condição for verdadeira.

        // ! (Operador de negação lógica)
        //
        // O operador ! significa "NÃO".
        // Sua função é inverter um valor booleano.
        //
        // Veja como funciona:
        //
        // true  -> false
        // false -> true
        //
        // Como a variável temCarteira vale false,
        // ao colocar o ! na frente acontece o seguinte:
        //
        // !false
        //
        // Resultado:
        // true
        //
        // Como o resultado da condição é true,
        // o bloco do if será executado.
        if (!temCarteira) {

            // Exibe uma mensagem no terminal.
            // Como a condição foi verdadeira,
            // esta linha será executada.
            System.out.println("Você não tem carteira de motorista");
        }

        // Se a variável tivesse o valor true:
        //
        // boolean temCarteira = true;
        //
        // O Java faria:
        //
        // !true
        //
        // Resultado:
        // false
        //
        // Como a condição seria falsa,
        // o código dentro do if NÃO seria executado.
    }
}